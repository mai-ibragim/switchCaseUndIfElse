package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, give some number: ");
        int lesson = scan.nextInt();
        switch (lesson) {
            case 1:
                System.out.println("The first lesson is Java");
                break;
            case 2:
                System.out.println("The second lesson is Technical Enlish");
                break;
            case 3:
                System.out.println("The third lesson is Sport");
                break;
            case 4:
                System.out.println("The forth lesson is Typing");
                break;
            default:
                System.out.println("There will be no lesson");
                

        }

        System.out.println("Please, give some number: ");
        int lesson1 = scan.nextInt();
        if (lesson1 == 1) {
            System.out.println("The first lesson is Java");
        } else if (lesson1 == 2) {
            System.out.println("The second lesson is Technical Enlish");
        } else if (lesson1 == 3) {
            System.out.println("The third lesson is Sport");
        } else if (lesson1 == 4) {
            System.out.println("The forth lesson is Typing");
        } else {
            System.out.println("There will be no lesson");
        }
    }
}

