package org.example;

import java.io.IOException;
import java.util.Random;

import static org.example.Shop.getNumberToys;
import static org.example.Shop.getToys;

public class Lototron extends Lot{

    public static void startGame()  {
        Random random=new Random();
        int randomNumber = random.nextInt(getNumberToys()*2  + 1) +1;
        if(randomNumber<getNumberToys()) {
            Toy toy = getToys().get(randomNumber);
            System.out.println("Вы выиграли: \n"+toy);
            deletWin(toy);

        }
        else System.out.println("вы выиграли ничего))");

    }

    public static void deletWin(Toy toy)  {
        Shop.deleteWin(toy);
        WriterWiner.createPrintWin(toy);

    }

}
