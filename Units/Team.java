package Семинар.Units;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    protected String teamName;
    protected int resorses;
    protected int count;
    protected int countAlive;
    protected int xStartPosition;
    protected int commonConsumption;
    public ArrayList<BaseUnit> listOfUnits;

    public Team(String teamName, int count, int resorses, int xStartPosition) {
        this.count = count;
        this.countAlive = count;
        this.teamName = teamName;
        this.resorses = resorses;
        this.xStartPosition = xStartPosition;
        this.listOfUnits = listOfRandomUnits(this.count, this.teamName, this.xStartPosition);
        this.commonConsumption = 0;
        for (BaseUnit unit : this.listOfUnits) {
            this.commonConsumption += unit.consumption;
        }
    }

//метод создания списка юнитов
    private static ArrayList<BaseUnit> listOfRandomUnits(int count, String teamName, int xStart) {
        ArrayList<BaseUnit> team = new ArrayList<>(count);
        Random r = new Random();
        for(int i = 0; i < count; i++) {
            switch(r.nextInt(7)){
                case 1: { team.add(new Crossbowman(xStart, i, teamName + (i+1))); break; }
                case 2: { team.add(new Monk(xStart, i, teamName + (i+1))); break; }
                case 3: { team.add(new Peasant(xStart, i, teamName + (i+1))); break; }
                case 4: { team.add(new Sniper(xStart, i, teamName + (i+1))); break; }
                case 5: { team.add(new Sorcerer(xStart, i, teamName + (i+1))); break; }
                case 6: { team.add(new Spearman(xStart, i, teamName + (i+1))); break; }
                case 0: { team.add(new Robber(xStart, i, teamName + (i+1))); break; }

            }
        }
        return team;
    }

    protected boolean wealthy() {
        return this.commonConsumption < this.resorses;
    }

}
