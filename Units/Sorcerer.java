package Семинар.Units;
/**Колдун
 * В теории может зачаровать, атаковать по области и игнор брони */
public class Sorcerer extends RangeUnit {
    private int attackAreaSize;

    public Sorcerer() {
        super(100, 10, 2, 1, 20, 5, 6);
        this.attackAreaSize = 2;
    }   

    public void enchant(BaseUnit target) {
        System.out.printf("Колдун зачаровал %s \n", target.getClass().getSimpleName());
    }
    @Override
    public void step() {
        System.out.println("Колдун. В теории может зачаровать, атаковать по области и игнор брони.");

    }
}