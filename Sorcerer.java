package Семинар;
/**зачаровать, атаковать по области                игнор брони дальность, */
public class Sorcerer extends RangeUnit {
    private int attackAreaSize;

    public Sorcerer() {
        super(100, 10, 2, 1, 20, 5, 6);
        this.attackAreaSize = 2;
    }   

    public void chare(BaseUnit target){
        System.out.printf("Колдун зачаровал %s \n", target.getClass().getSimpleName());
    }
}