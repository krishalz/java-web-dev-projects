package org.launchcode;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius; //declare radius variable

        //added do-while loop to check for valid input from user
        do {
            System.out.println("Enter the radius of the circle: ");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input. Try again.");
                input.next();
            }
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("Radius needs to be a positive number.");
            }
        } while (radius <= 0);

        //call the method to calculate the area of the circle using user input radius variable
        double area = getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        input.close();
    }

        public static Double getArea(Double radius) {
            return Math.PI * radius * radius;
        }
}
