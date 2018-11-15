package org.launchcode.java.demos.java4python.ClassOneExercises;

import java.util.Scanner;

class ClassOneHelperMethods {

    static void printHelloWorld(String name){
        System.out.println(String.format("Hello, %s!", name));
    }

    static void printRectangularArea(double shortSide, double longSide){
        System.out.println(String.format("The area of your rectangle is: %.2f",shortSide * longSide));
    }

    static void printMPG(double milesTraveled, double gasConsumed){
        System.out.println(String.format("MPG is %.2f", milesTraveled / gasConsumed));
    }

    static void printIsFound(String searchTerm, String alice){
        String regex = String.format(".*(?i)%s.*",searchTerm);
        System.out.println(String.format("The result of %s being found is .... %b",searchTerm, alice.matches(regex)));
    }

    static void printCircleArea(double number){
        System.out.println(String.format("The area of a circle of radius %.1f is: %.3f", number, Math.PI * Math.pow(number,2)));
    }

    static double getDoubleInput(){
        Scanner doubleInput = new Scanner(System.in);

        double number;

        do{
            number = doubleInput.nextDouble();
            if(!isValidDouble(number)){
                System.out.print("You've Entered A Negative Number Try Again: ");
            }
        }while(!isValidDouble(number));

        return number;
    }


    static String getStringInput(){
        Scanner stringInput = new Scanner(System.in);

        return stringInput.nextLine();
    }

    private static boolean isValidDouble(double number){
        return number > 0;
    }

}