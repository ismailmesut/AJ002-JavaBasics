package com.ismailmesutmujde.javabasics;

public class Statements {
    public static void main(String[] args) {

        // Statements

        // if statement
        int x = 30;
        int y = 4;
        int z = 5;

        if (x<y) {
            System.out.println("y is bigger");
        }

        // if - else statement
        if (x<y) {
            System.out.println("y is bigger");
        } else {
            System.out.println("x is bigger");
        }

        // if - else if statement
        if (x<y) {
            System.out.println("y is bigger");
        } else if (y<x) {
            System.out.println("x is bigger");
        } else if (x==y) {
            System.out.println("x = y");
        }

        // if - else if - else statement
        if (x<y) {
            System.out.println("y is bigger");
        } else if (y<x) {
            System.out.println("x is bigger");
        } else {
            System.out.println("x = y");
        }

        // switch

        int day = 3;
        String dayString = "";

        /*
        if (day == 1) {
            dayString = "Monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else if (day == 3) {
            dayString = "Wednesday";
        } else if (day == 4) {
            dayString = "Thursday";
        } else if (day == 5) {
            dayString = "Friday";
        } else if (day == 6) {
            dayString = "Saturday";
        } else {
            dayString = "Sunday";
        }*/

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Sunday";
                break;
        }
        System.out.println(dayString);
    }
}
