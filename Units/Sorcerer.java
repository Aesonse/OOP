package Семинар.Units;

import java.util.ArrayList;

/**Колдун
 * В теории может зачаровать, атаковать по области и игнор брони */
public class Sorcerer extends RangeUnit {
    private int attackAreaSize;

    public Sorcerer(int x, int y, String name) {
        super(100, 10, 2, 1, 20, 5, 6, x, y, name,5);
        this.attackAreaSize = 2;
    }   

    public void enchant(BaseUnit target) {
        System.out.printf("Колдун зачаровал %s \n", target.getClass().getSimpleName());
    }
    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);
    }
}