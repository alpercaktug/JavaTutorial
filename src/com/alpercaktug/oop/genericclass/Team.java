package com.alpercaktug.oop.genericclass;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private Team opponent;

    private ArrayList<T> teamList = new ArrayList<T>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player){
        if (teamList.contains(player)){
            System.out.println(player.getName() + " has already added.");
            return false;
        } else {
            teamList.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName );
            return true;

        }
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        } else if(ourScore == theirScore){
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2 ) + tied;
    }

    public void writeTeamList(){
        for (int i = 0; i<teamList.size(); i++){
            System.out.println(teamList.get(i).getName());
        }
    }

}
