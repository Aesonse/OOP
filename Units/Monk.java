package Семинар.Units;

import java.util.ArrayList;

/**Монах
 * Хилит. Выделить метод изменения здоровья в базовом классе.
 */
public class Monk extends BaseUnit {
    private int healing;

    public Monk(int x, int y, String name) {
        super(100, 10, 2, 1, 5, 5, x, y, name,5);
    }
    public void heal(BaseUnit target) {
        target.changeHp(this.healing);;
    }
    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);

    }
}