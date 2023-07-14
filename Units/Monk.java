package Семинар.Units;
/**Монах
 * Хилит. Выделить метод изменения здоровья в базовом классе.
 */
public class Monk extends BaseUnit {
    private int healing;

    public Monk() {
        super(100, 10, 2, 1, 5, 5);
    }
    public void heal(BaseUnit target) {
        target.hp = this.healing + target.hp > target.maxHp ? target.maxHp : this.healing + target.hp;
    }
    @Override
    public void step() {
        System.out.println("Монах. Хилит.");

    }
}