package org.launchcode;
import java.util.Scanner;
//ex C numeric types calculating mpg
public class GasMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();

        System.out.println("Number of gallons of gas used:");
        Double gallons = input.nextDouble();

        System.out.println("Miles per gallon is " + miles / gallons);
    }
}
