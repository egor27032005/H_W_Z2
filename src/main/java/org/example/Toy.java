package org.example;

public class Toy {
    public int toyID;
    public String toyName;
    public Toy(int toyID,String toyName){
        this.toyID=toyID;
        this.toyName=toyName;
    }

    public void setToyID(int toyID) {
        this.toyID = toyID;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyID() {
        return toyID;
    }

    public String getToyName() {
        return toyName;
    }

    @Override
    public String toString(){
        return "Игрушка:"+toyName+" ID:"+toyID;
    }
}
