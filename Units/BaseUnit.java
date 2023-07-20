package Семинар.Units;

import java.util.ArrayList;

/**Базовые свойства: Здоровье, броня, скорость, потребление, урон, инициатива
 * Базовые методы: атаковать, защищаться, перемещаться, умирать 
 */
public abstract class BaseUnit implements GameInterface{
    /**Состояние живой (true)/ мертвый (false) */
    protected boolean alive; 
    /**Текущее здоровье */
    protected int hp; 
    protected int maxHp;
    protected int armor;
    protected int speed;
    protected int consumption;
    protected int damage;
    protected int defense;
    protected int initiative;
    protected Coordinates coordinates;
    protected String name;
     
/** Базовый конструктор юнита*/
    protected BaseUnit(int maxHp, int armor, int speed, int consumption, int damage, 
                        int defense, int x, int y, String name, int initiative) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.armor = armor;
        this.speed = speed;
        this.consumption = consumption;
        this.damage = damage;
        this.defense = defense;
        this.alive = true;
        this.coordinates = new Coordinates(x, y);
        this.name = name;
        this.initiative = initiative;

    }
/** Метод получения актуальной информации о персонаже */
    public String getInfo() {
        if (this.alive) {
            return String.format("[Имя: %s Класс: %s Здоровье: %d / %d Координты: %s]",
                    this.name,
                    this.getClass().getSimpleName(),
                    this.hp,
                    this.maxHp,
                    this.coordinates.toString());
        }
        return String.format("%s мертвый", this.getClass().getSimpleName());
    }


    public int getInitiative(){
        return this.initiative;
    }

    protected void changeHp(int difference) {
        this.hp += difference;
        if(this.hp > this.maxHp) this.hp = this.maxHp;
        else if(this.hp < 1) this.die();
    }

/**Базовый метод атаки. Реализовать проверку ренжа для атаки и для защиты. */
    protected void attack(BaseUnit target) {
        target.changeHp(-(this.damage > target.armor ? this.damage - target.armor : 1));
        if(target.alive) target.defendFrom(this);
    }

    

    protected void die(){
        System.out.printf("%s умер!!!\n", this.getClass().getSimpleName());
        this.alive = false;
    }
    /**Защита при атаке. Работает аналогично атаке, но вместо параметра {@link #damage} 
     * используется параметр {@link #defense} */
    protected void defendFrom(BaseUnit agressor){
        agressor.changeHp(-(this.defense > agressor.armor ? this.defense - agressor.armor : 1));
    }

    protected BaseUnit nearestEnemy(Team enemies) {
        double minDistance = 100.0;
        BaseUnit nE = enemies.listOfUnits.get(0);
        for(BaseUnit enemy : enemies.listOfUnits) {
            double distance = Math.sqrt(Math.pow((this.coordinates.x-enemy.coordinates.x), 2) +
                    Math.pow((this.coordinates.y-enemy.coordinates.y), 2));
            if(distance < minDistance && enemy.alive) {
                nE = enemy; 
                minDistance = distance;
            }
        }
        return nE;
    } 

}