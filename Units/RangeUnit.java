package Семинар.Units;
public abstract class RangeUnit extends BaseUnit {
    protected int attackRange;
    
    protected RangeUnit(int maxHp, int armor, int speed, int consumption, int damage, int defense, int attackRange){
        super(maxHp, armor, speed, consumption, damage, defense);
        this.attackRange = attackRange;
    }
/**Переопределение метода получения информации для дальников */
    public String getInfo() {
        if (this.alive) {
            return String.format("%sДальность: %d] ",
                    super.getInfo().replace("]", " "),
                    this.attackRange);
        }
        return super.getInfo();
    }

    public void attack(BaseUnit target) {
        target.hp -= this.damage > target.armor ? this.damage - target.armor : 1;
        if(target.hp <= 0) { target.die(); }
    }

}