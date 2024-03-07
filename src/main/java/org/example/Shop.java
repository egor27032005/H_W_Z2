package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.reflect.Array.get;

public class Shop implements Shoping {
    static Map<String,Integer> toyNames = new HashMap<String,Integer>();
    static ArrayList<Integer> toyIDs = new ArrayList<>();
    static ArrayList<Toy> toys=new ArrayList<>();
    static int numberToys=0;

    public static int getNumberToys() {
        return numberToys;
    }

    public static ArrayList<Toy> getToys() {
        return toys;
    }

    public static void addToyName(String toyName) {
        toyNames.putIfAbsent(toyName,0);
        toyNames.put(toyName,toyNames.get(toyName)+1);
//        boolean a = true;
//        for (String s : toyNames) {
//            if (s.equals(toyName)) {
//                a = false;
//                break;
//            }
//        }
//        if (a)
//            toyNames.add(toyName);
    }

    public static void addToyIDs(int toyID) {
        toyIDs.add(toyID);
    }
    public static void addToy(Toy toy){
        toys.add(toy);
        numberToys++;
        addToyIDs(toy.getToyID());
        addToyName(toy.getToyName());
    }
    public static void print(){
        for (Map.Entry<String, Integer> pair : toyNames.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
    public static void deleteWin(Toy toy) {
        String toyName=toy.getToyName();
        toyNames.put(toyName,toyNames.get(toyName)-1);
        int id=toy.getToyID();
        int a=toyIDs.indexOf(id);
        toyIDs.remove(a);
        toys.remove(a);
        numberToys--;
    }
    public static void probability(){
        for (Map.Entry<String, Integer> pair : toyNames.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            double ver=(double)value/(numberToys*2)*100;
            System.out.print(key + ":");
            System.out.printf("%.1f",ver);
            System.out.println("%");
        }
    }

    public static void setToyIDs(ArrayList<Integer> toyIDs) {
        Shop.toyIDs = toyIDs;
    }

    public static void setToyNames(Map<String,Integer> toyNames) {
        Shop.toyNames = toyNames;
    }

    public static ArrayList<Integer> getToyIDs() {
        return toyIDs;
    }

    public static Map<String,Integer> getToyNames() {
        return toyNames;
    }

}
