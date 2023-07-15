package Семинар.Units;

import java.util.ArrayList;

/**Снайпер 
 * Тупо дальнобойный
  */
public class Sniper extends RangeUnit{

    public Sniper(int x, int y, String name) {
        super(100, 10, 2, 1, 20, 5, 20, x, y, name);
    } 
    @Override
    public void step(ArrayList<BaseUnit> enemyTeam) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemyTeam).name);
    }
}