package Семинар;
/**Свойство production метод farm*/
public class Peasant extends BaseUnit {
    private int production; 

    public Peasant() {
        super( 100, 10, 10,  10,  0,  18);
        this.production = 10;
        }
    public void farm() {
        System.out.printf("Крестьянин произвел %d ресурсов \n", this.production);
    }
}