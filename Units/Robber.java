package Семинар.Units;

import java.util.ArrayList;

/**Разбойник: крадет оружие и продовольствие (дописать) */
public class Robber extends BaseUnit {
    public Robber(int x, int y, String name) {
        super(100, 12, 3, 6, 30, 20, x, y, name,5);
    }
    
    public void stealWeapoon(BaseUnit target){
        System.out.printf("Разбойник %s украл оружие у %s \n", this.getClass().getSimpleName(), target.getClass().getSimpleName());
    }
    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);
    }
}