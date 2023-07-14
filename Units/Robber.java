package Семинар.Units;
/**Разбойник: крадет оружие и продовольствие (дописать) */
public class Robber extends BaseUnit {
    public Robber() {
        super(100, 12, 3, 6, 30, 20);
    }
    
    public void stealWeapoon(BaseUnit target){
        System.out.printf("Разбойник %s украл оружие у %s \n", this.getClass().getSimpleName(), target.getClass().getSimpleName());
    }
    @Override
    public void step() {
        System.out.println("Разбойник: крадет оружие и продовольствие (дописать).");

    }
}