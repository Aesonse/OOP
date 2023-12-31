package Семинар.Units;

import java.util.ArrayList;

/**Крестьянин
 * Описать метод производства ресурсов и трата ресурсов остальными классами
 * Добавить голодание в базовый класс
 * Ресурсы хранятся в статической переменной?
*/
public class Peasant extends BaseUnit {
    private int production; 

    public Peasant(int x, int y, String name) {
        super( 100, 10, 10,  10,  0,  18, x, y, name,5);
        this.production = 10;
        }
    public void farm() {
        System.out.printf("Крестьянин произвел %d ресурсов \n", this.production);
    }
    @Override
    public void step(Team friends, Team enemies) {
        System.out.println(this.name + "- ближайший противник " + this.nearestEnemy(enemies).name);
    }
}