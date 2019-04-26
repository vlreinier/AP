package Opd17;

import java.util.ArrayList;

public class Person {
    private String name;
    private double budget;
    private ArrayList<Game> games = new ArrayList<>();

    public Person(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public boolean buyGame(Game game){
        if (checkGame(game)) {
            this.budget = this.budget - game.currentValue();
            this.games.add(game);
            return true;
        }
        return false;
    }

    public boolean checkGame(Game game){
        if (game.currentValue() > this.budget) {
            return false;
        }
        for (Game bought : this.games) {
            if (bought.getName().equals(game.getName()))
                return false;
        }
        return true;
    }

    public boolean sellGame(Game game, Person buyer) {
        if (this.games.contains(game) && buyer.buyGame(game)){
            this.games.remove(game);
            this.budget = this.budget + game.currentValue();
            return true;
        }
        return false;
    }

    public String toString(){
        String output = this.name + " heeft een budget van € " + this.budget + " en bezit de volgende games:\n";
        for (Game game: this.games){
            output += game.toString() + "\n";
        }
        return output;
    }
}