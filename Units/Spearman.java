package Семинар.Units;

import java.util.ArrayList;

/**Копейщик.
 * ближний юнит*/
public class Spearman extends BaseUnit{
    public Spearman(int x, int y, String name) {
        super(10, 10, 20, 30, 40, 50, x, y, name,5);
    }
    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);
    }
    
}