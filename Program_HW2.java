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
 * Добавить файл с описанием интерфейса. В котором описать два метода, void
 * step(); и String getInfo(); Реализовать интерфейсs в абстрактном классе и в
 * наследниках так, чтобы getInfo возвращал тип персонажа. Создать два списка в
 * классе main. В каждый из списков добавить по десять экземнляров наследников
 * BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть. В
 * main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Program_HW2 {
    public static void main(String[] args) {
       ArrayList<BaseUnit> team1 = newTeam(10);
       ArrayList<BaseUnit> team2 = newTeam(10);
       
       team1.forEach(member -> System.out.println(member.getInfo()));
       System.out.println();
       for(BaseUnit member : team2) {
        System.out.println(member.getInfo());
       }


    }
    
    public static ArrayList<BaseUnit> newTeam(int count) {
        ArrayList<BaseUnit> team = new ArrayList<>(count);
        Random r = new Random();
        for(int i = 0; i < count; i++) {
            switch(r.nextInt(7)){
                case 1: { team.add(new Crossbowman()); break; }
                case 2: { team.add(new Monk()); break; }
                case 3: { team.add(new Peasant()); break; }
                case 4: { team.add(new Sniper()); break; }
                case 5: { team.add(new Sorcerer()); break; }
                case 6: { team.add(new Spearman()); break; }
                case 0: { team.add(new Robber()); break; }

            }

        }
        return team;
    }
}