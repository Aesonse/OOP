package Семинар.Units;

import java.util.ArrayList;

/**Монах
 * Хилит. Выделить метод изменения здоровья в базовом классе.
 */
public class Monk extends BaseUnit {
    private int healing;

    public Monk(int x, int y, String name) {
        super(100, 10, 2, 1, 5, 5, x, y, name);
    }
    public void heal(BaseUnit target) {
        target.hp = this.healing + target.hp > target.maxHp ? target.maxHp : this.healing + target.hp;
    }
    @Override
    public void step(ArrayList<BaseUnit> enemyTeam) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemyTeam).name);

    }
}