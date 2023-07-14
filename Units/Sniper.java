package Семинар.Units;
/**Снайпер 
 * Тупо дальнобойный
  */
public class Sniper extends RangeUnit{

    public Sniper() {
        super(100, 10, 2, 1, 20, 5, 20);
    } 
    @Override
    public void step() {
        System.out.println("Снайпер. Тупо дальнобойный");

    }
}