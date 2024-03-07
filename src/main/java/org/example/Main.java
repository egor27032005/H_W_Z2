package org.example;

import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IncorrectValueException {
            Main main=new Main();
            main.createShop();
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Одна игра стоит 100 рублей \nЧтобы начать игру, вставьте купюру");
                String menu = " 0 - Показать функционал\n" +
                        " 1 - Начать игру\n 2 - Закончить игру\n" +
                        " 3 - Посмотреть весь список игрушек\n" +
                        " 4 - Узнать вероятность выиграша\n" +
                        " 5 - Посмотреть выигрыш\n" +
                        " 6 - Пополнить баланс";
                System.out.println(menu);
                boolean run = true;
                while (run) {
                    int command = sc.nextInt();
                    try {
                        int n = Integer.parseInt(String.valueOf(command));
                    } catch (IncorrectValueException e) {
                        throw new IncorrectValueException("не ломайте автомат");
                    }

                    if (command > -1 && command < 7) {
                        switch (command) {
                            case 0 -> System.out.println(menu);
                            case 1 -> Many.getMany();
                            case 2 -> run = false;
                            case 3 -> Shop.print();
                            case 4 -> Shop.probability();
                            case 5 -> WriterWiner.printWin();
                            case 6 -> Many.balance();
                        }
                    } else {
                        throw new InvalidPropertiesFormatException("не ломайте автомат");
                    }
                }
                if (!run) WriterWiner.file();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }





        public void createShop(){
        Toy toy1 =new Toy(1234567,"LEGO city");
        Toy toy2 =new Toy(2345678,"LEGO city");
        Toy toy3 =new Toy(3456789,"LEGO city");
        Toy toy4 =new Toy(4567890,"LEGO city");
        Toy toy5 =new Toy(5678901,"LEGO city");
        Toy toy6 =new Toy(6789012,"Car");
        Toy toy7 =new Toy(7890123,"Car");
        Toy toy8 =new Toy(8901234,"Car");
        Toy toy9 =new Toy(9012345,"Doll");
        Toy toy10=new Toy(6123456,"Doll");
        Toy toy11=new Toy(1357924,"Doll");
        Toy toy12=new Toy(2468135,"Teddy bear");
        Toy toy13=new Toy(3579246,"Teddy bear");
        Toy toy14=new Toy(6786746,"Plush Shark");
        Toy toy15=new Toy(3452786,"Plush Shark");
        Toy toy16=new Toy(2345246,"Soldiers");
        Toy toy17=new Toy(1357246,"Soldiers");
        Toy toy18=new Toy(5572346,"Robot");
        Toy toy19=new Toy(4352245,"Robot");
        Toy toy20=new Toy(6445644,"Machine");
        Shop.addToy(toy1);
        Shop.addToy(toy2);
        Shop.addToy(toy3);
        Shop.addToy(toy4);
        Shop.addToy(toy5);
        Shop.addToy(toy6);
        Shop.addToy(toy7);
        Shop.addToy(toy8);
        Shop.addToy(toy9);
        Shop.addToy(toy10);
        Shop.addToy(toy11);
        Shop.addToy(toy12);
        Shop.addToy(toy13);
        Shop.addToy(toy14);
        Shop.addToy(toy15);
        Shop.addToy(toy16);
        Shop.addToy(toy17);
        Shop.addToy(toy18);
        Shop.addToy(toy19);
        Shop.addToy(toy20);


    }
}