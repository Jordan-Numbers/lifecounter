package edu.washington.j75smith.lifecounter;

/**
 * Created by jordans_macbook on 4/21/15.
 */
public class Player {

    private String name;
    private int lifeTotal;

    public Player(String name){
        this.name = name;
        this.lifeTotal = 20;
    }

    public void setLifeTotal(int lifeTotal) {
        this.lifeTotal = lifeTotal;
    }

    public int getLifeTotal() {
        return lifeTotal;
    }

    public void gainLife(int amount){
        this.lifeTotal = this.lifeTotal + amount;
    }
    public void loseLife(int amount){
        this.lifeTotal = this.lifeTotal - amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
