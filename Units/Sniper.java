package Семинар.Units;

import java.util.ArrayList;

/**Снайпер 
 * Тупо дальнобойный
  */
public class Sniper extends RangeUnit{

    public Sniper(int x, int y, String name) {
        super(100, 10, 2, 1, 20, 5, 20, x, y, name,5);
    }

    protected void specialAttac(BaseUnit target) {
        super.attack(target);
        super.attack(target);
        super.attack(target);
    }


    @Override
    public void step(Team friends, Team enemies) {
        if(!this.alive) return;
        BaseUnit target = this.nearestEnemy(enemies);
        
        if(friends.wealthy()) this.specialAttac(target);
        else this.attack(target);

        if(friends.resorses < this.consumption) this.changeHp(-1);
        else friends.resorses -= this.consumption;
        return;
    }
}