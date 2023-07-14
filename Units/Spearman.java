package Семинар.Units;
/**Копейщик.
 * ближний юнит*/
public class Spearman extends BaseUnit{
    public Spearman() {
        super(10, 10, 20, 30, 40, 50);
    }
    @Override
    public void step() {
        System.out.println("Копейщик.ближний юнит ");

    }
    
}