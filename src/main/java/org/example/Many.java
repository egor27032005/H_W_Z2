package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Many {
    static Scanner sc = new Scanner(System.in);
    public static void setMany(Integer many) {
        Many.many = many;
    }

    static Integer many=0;
    public static void getMany() throws IOException {
        if (many < 100) {
            System.out.println("Одна игра стоит 100 рублей \nВставьте купюру");
            many += sc.nextInt();
            if (many >= 100) {
                Lototron.startGame();
                many -= 100;
            }
            else{
                throw new IOException("иди домой нищеброд");
            }
        } else {
            Lototron.startGame();
            many -= 100;
            System.out.println("Баланс:" + many);
        }
    }
        public static void balance(){
            many+=sc.nextInt();
        }



}
