package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WriterWiner {
    static Map<String,Integer> toyNamesWin = new HashMap<String,Integer>();

    public static void createPrintWin(Toy toy){
        String toyName=toy.getToyName();
            toyNamesWin.putIfAbsent(toyName,0);
            toyNamesWin.put(toyName,toyNamesWin.get(toyName)+1);
    }
    public static void file(){
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            for (Map.Entry<String, Integer> entry : toyNamesWin.entrySet()) {
                writer.println(entry.getKey() + "=" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printWin(){
        for (Map.Entry<String, Integer> pair : toyNamesWin.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

}

