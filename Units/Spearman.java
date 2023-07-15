package Семинар.Units;

import java.util.ArrayList;

/**Копейщик.
 * ближний юнит*/
public class Spearman extends BaseUnit{
    public Spearman(int x, int y, String name) {
        super(10, 10, 20, 30, 40, 50, x, y, name);
    }
    @Override
    public void step(ArrayList<BaseUnit> enemyTeam) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemyTeam).name);
    }
    
}