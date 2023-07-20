package Семинар;

import java.util.ArrayList;
import java.util.Comparator;
import Семинар.Units.BaseUnit;
import Семинар.Units.Team;

/**
 * Реализовать степ лучника. По действиям.
 * Вызывать персонажей из обеих комманд в порядке инициативы.
 */
public class Program_HW4 {
    public static void main(String[] args) {
       Team team1 = new Team("Orc", 10, 100, 0);
       Team team2 = new Team("Elf", 10, 100, 9);

       for(BaseUnit unit : team1.listOfUnits) System.out.println(unit.getInfo());
       System.out.println("-------------------------------------------------");
       for(BaseUnit unit : team2.listOfUnits) System.out.println(unit.getInfo());
       System.out.println("-------------------------------------------------");
       System.out.println("-------------------------------------------------"); 

       ArrayList<BaseUnit> sortedInitiativeUnits = new  ArrayList<>(20);
       sortedInitiativeUnits.addAll(team1.listOfUnits);
       sortedInitiativeUnits.addAll(team2.listOfUnits);
       sortedInitiativeUnits.sort(new Comparator<BaseUnit>() {
            @Override
        public int compare(BaseUnit unit1, BaseUnit unit2) {
            return unit2.getInitiative() - unit1.getInitiative();
        }});
        
        for(BaseUnit unit : sortedInitiativeUnits) {
            if(team1.listOfUnits.indexOf(unit) != -1) unit.step(team1, team2);
            else unit.step(team2, team1);
        }
        
        for(BaseUnit unit : team1.listOfUnits) System.out.println(unit.getInfo());
        System.out.println("-------------------------------------------------");
        for(BaseUnit unit : team2.listOfUnits) System.out.println(unit.getInfo());

    }
}