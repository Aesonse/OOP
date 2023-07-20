package Семинар.Units;
public abstract class RangeUnit extends BaseUnit {
    protected int attackRange;
    
    protected RangeUnit(int maxHp, int armor, int speed, int consumption, int damage, int defense, int attackRange, int x, int y, String name, int initiative) {
        super(maxHp, armor, speed, consumption, damage, defense, x, y, name, initiative);
        this.attackRange = attackRange;
    }
/**Переопределение метода получения информации для дальников */
    public String getInfo() {
        if (this.alive) {
            return String.format("%s(Дальний)] ",
                    super.getInfo().replace("]", " "),
                    this.attackRange);
        }
        return super.getInfo();
    }

    public void attack(BaseUnit target) {
        target.changeHp(-(this.damage > target.armor ? this.damage - target.armor : 1));
    }

}