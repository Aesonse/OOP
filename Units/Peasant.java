package Семинар.Units;
/**Крестьянин
 * Описать метод производства ресурсов и трата ресурсов остальными классами
 * Добавить голодание в базовый класс
 * Ресурсы хранятся в статической переменной?
*/
public class Peasant extends BaseUnit {
    private int production; 

    public Peasant() {
        super( 100, 10, 10,  10,  0,  18);
        this.production = 10;
        }
    public void farm() {
        System.out.printf("Крестьянин произвел %d ресурсов \n", this.production);
    }
    @Override
    public void step() {
        System.out.println("Крестянин. Добывет ресурсы.");

    }
}