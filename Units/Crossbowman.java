package Семинар.Units;

import java.util.ArrayList;

/** арбалетчик */
public class Crossbowman extends RangeUnit {
    private int armorIgnoreRange;

    /**
     * Арбалетчик.
     * Дальний юнит, пробивающий броню на близкой дистанции
     * (переписать метод атаки)
     */
    public Crossbowman(int x, int y, String name) {
        super(100, 10, 2, 1, 20, 5, 6, x, y, name, 4);
        this.armorIgnoreRange = 2;
    }

    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);

    }
}