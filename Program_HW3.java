package Семинар;

import java.util.ArrayList;
import java.util.Random;

import Семинар.Units.BaseUnit;
import Семинар.Units.Crossbowman;
import Семинар.Units.Monk;
import Семинар.Units.Peasant;
import Семинар.Units.Robber;
import Семинар.Units.Sniper;
import Семинар.Units.Sorcerer;
import Семинар.Units.Spearman;

/**
 * Создать класс с описанием координат, x и y.
 * Добавить в абстрактный класс поле с координатами и пробросить его
 * инициализацию до конструкторов персонажей. Farmer farmer = new
 * Farmer(getName(), x, y); 3 Поиск среди противников наиболее приближённого
 * .вывести расстояние до него и его имя в консоль.
 */
public class Program_HW3 {
    public static void main(String[] args) {
       ArrayList<BaseUnit> team1 = newTeam(10, "Orc", 0);
       ArrayList<BaseUnit> team2 = newTeam(10, "Elf", 9);
       
       team1.forEach(member -> member.step(team2));
       System.out.println();
       team2.forEach(member -> member.step(team1));


    }
    
    public static ArrayList<BaseUnit> newTeam(int count, String teamName, int xStart) {
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
}