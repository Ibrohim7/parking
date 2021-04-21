package com.SetApp;

public class Main {

    public static void main(String[] args) {
    int a=1;
    while (a<12){
        System.out.println("ishladi");
        a++;
    }
    do {
        System.out.println("ishladi");
    }while (a<2);

    String[] cars={"matiz","gentra","cobalt"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
        for (String car:cars){
            System.out.println(car);
        }
    }
}
