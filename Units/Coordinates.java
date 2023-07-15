package Семинар.Units;

public class Coordinates {
    protected int x;
    protected int y;
    public Coordinates(int x, int y) {
       this.x = x;
       this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d", this.x, this.y);
    }

}
