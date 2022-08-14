package com.alpercaktug;

import com.alpercaktug.oop.genericclass.BasketballPlayer;
import com.alpercaktug.oop.genericclass.FootballPlayer;
import com.alpercaktug.oop.genericclass.Team;

public class Main {

    public static void main(String[] args) {

        Team<FootballPlayer> goztepe = new Team("Göztepe");

        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer chandler = new FootballPlayer("Chandler");
        FootballPlayer rose = new FootballPlayer("Rose");

        BasketballPlayer jordan = new BasketballPlayer("Jordan");

        goztepe.addPlayer(joe);
        goztepe.addPlayer(chandler);
        goztepe.addPlayer(rose);

        //goztepe.addPlayer(jordan);

        //team.writeTeamList();

        Team<FootballPlayer> besiktas = new Team("Beşiktaş");

        FootballPlayer one = new FootballPlayer("One");
        FootballPlayer two = new FootballPlayer("Two");
        FootballPlayer three = new FootballPlayer("Three");

        besiktas.addPlayer(one);
        besiktas.addPlayer(two);
        besiktas.addPlayer(three);

        goztepe.matchResult(besiktas, 10,5);
        besiktas.matchResult(goztepe, 10,5);
        besiktas.matchResult(goztepe, 10,5);


        System.out.println(goztepe.getTeamName() + " Ranking = " + goztepe.ranking());
        System.out.println(besiktas.getTeamName() + " Ranking = " + besiktas.ranking());



    }

}
