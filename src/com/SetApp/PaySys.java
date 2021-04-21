package com.SetApp;

import java.util.Scanner;

public class PaySys {
    public static void main(String[] args) {
        double balance=10000;
        int password=1717;
        Scanner scanner = new Scanner(System.in);
        int command;
        while (true){
            System.out.println("1=>Check balance, 2=>Pul yechish, 3=>Pul olish, 4=>Change password, 5=>Mobil operator bn bog'lanish");
            command=scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("Insert password");
                    int code = scanner.nextInt();
                    if (password==code){
                        System.out.println("Balance: "+balance);
                    }else {
                        System.err.println("password incorrect");
                    }
                    break;
                case 2:
                    System.out.println("Insert password");
                    code=scanner.nextInt();
                    if (password==code){
                        System.out.println("Summani kiriting");
                        double sum = scanner.nextDouble();
                        if (balance>=sum){
                            balance-=sum;
                            System.out.println("Success");
                        }else {
                            System.err.println("Balance da yetarli mablag' mavjud emas");
                        }
                    }else {
                        System.err.println("password incorrect");
                    }
                case 3:
                    System.out.println("Insert password");
                    code=scanner.nextInt();
                    if (password == code){
                        System.out.println("Summani kiriting");
                        double sum = scanner.nextDouble();
                        if (balance>=sum);
                        balance+=sum;
                        System.out.println("Success");

                    }else {
                        System.err.println("password incorrect");
                    }break;
                case 4:
                    System.out.println("Insert password");
                    code=scanner.nextInt();
                    if (password==code){
                        System.out.println("Enter new password");
                        int ask = scanner.nextInt();
                        System.out.println("Second time");
                        int second = scanner.nextInt();
                        if (ask==second);
                        password=ask;
                        System.out.println("Success");
                    }else{
                        System.err.println("Password is incorrect");
                    }
                    break;
                case 5:
                    System.out.println("telefon raqamingizni kiriting");
                    String phone = scanner.next();
                    if (phone.length()==13){
                        System.out.println("Summani kiriting");
                        double sum = scanner.nextDouble();
                        if (balance>=sum && sum>1000){
                            balance-=sum;
                            System.out.println("success");
                        }else {
                            System.err.println("mablag' yetarli emas");
                        }
                    }


            }

        }



    }
}
