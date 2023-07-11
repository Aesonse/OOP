package Семинар;
/**Базовые свойства: Здоровье, броня, скорость, потребление, урон, инициатива
 * Базовые методы: атаковать, защищаться, перемещаться, умирать 
 */
public class BaseUnit {
    protected boolean alive;
    protected int hp; 
    protected int maxHp;
    protected int armor;
    protected int speed;
    protected int consumption;
    protected int damage;
    protected int defense;
    protected int initiative;
/** Базовый конструктор юнита*/
    protected BaseUnit(int maxHp, int armor, int speed, int consumption, int damage, int defense) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.armor = armor;
        this.speed = speed;
        this.consumption = consumption;
        this.damage = damage;
        this.defense = defense;
        this.alive = true;
    }
/** Метод получения актуальной информации о персонаже */
    public String getInfo() {
        if (this.alive) {
            return String.format("[Класс: %s Здоровье: %d / %d Броня: %d Скорость: %d Потребление: %d Дамаг: %d Защита: %d] ",
                    this.getClass().getSimpleName(),
                    this.hp,
                    this.maxHp,
                    this.armor,
                    this.speed,
                    this.consumption,
                    this.damage,
                    this.defense);
        }
        return String.format("%s мертвый", this.getClass().getSimpleName());
    }

    public void attack(BaseUnit target) {
        target.hp -= this.damage > target.armor ? this.damage - target.armor : 1;
        if(target.hp <= 0) { target.die(); }
        else { target.defendFrom(this);}
    }

    public void die(){
        System.out.printf("%s умер!!!\n", this.getClass().getSimpleName());
        this.alive = false;
    }
    public void defendFrom(BaseUnit agressor){
        agressor.hp -= this.defense > agressor.armor ? this.defense - agressor.armor : 1;
        if(agressor.hp <= 0) { agressor.die(); }
    }

    
}