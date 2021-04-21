package com.SetApp;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int place = 15;
        double price = 5000;
        String car;
        int command;
        while (true){
            System.out.println("0=>Finishing, 1=>Place, 2=>Entering, 3=>Exit" );
                command=scanner.nextInt();
                switch (command){
                    case 0:
                        System.out.println("Daily money");
                        double money = scanner.nextDouble();
                        break;
                    case 1:
                        System.out.println("There are " + place + " cars");
                    case 2:
                        int enter = scanner.nextInt();
                        if (enter>=place){
                        System.out.println("There is not extra place");

                    }else {
                            place-=enter;
                        }


                }
            }
        }
    }

