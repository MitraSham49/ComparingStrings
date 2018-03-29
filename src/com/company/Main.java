package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        String rain = "rain", windy = "windy", snow = "snow";
        boolean done = false;
        String result;
        Scanner scan = new Scanner(System.in);
        while (done != true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("How is the weather?");
            String answer = sc.nextLine();

            if (answer.equals(rain))
                System.out.println("Take your umbrella!");
            else if (answer.equals(windy))
                System.out.println("Wear your jacket!");
            else if (answer.equals(snow))
                System.out.println("Wear a coat and take a shovel!");
            else
                System.out.println("Enjoy your day!");
            System.out.print("Do you want to continue?(y/n)");
            result = scan.nextLine();
            if (result.equalsIgnoreCase("n"))
                done = true;
        }
    }
}