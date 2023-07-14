package Семинар.Units;

/** арбалетчик */
public class Crossbowman extends RangeUnit {
    private int armorIgnoreRange;

    /**
     * Арбалетчик.
     * Дальний юнит, пробивающий броню на близкой дистанции
     * (переписать метод атаки)
     */
    public Crossbowman() {
        super(100, 10, 2, 1, 20, 5, 6);
        this.armorIgnoreRange = 2;
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик. Является дальнобойным юнитом. Пробивает броню на короткой дистанции.");

    }
}