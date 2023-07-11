package Семинар;
/**арбалетчик */
public class Crossbowman extends RangeUnit {
    private int armorIgnoreRange;

    public Crossbowman() {
        super(100, 10, 2, 1, 20, 5, 6);
        this.armorIgnoreRange = 2;
    }
    
}