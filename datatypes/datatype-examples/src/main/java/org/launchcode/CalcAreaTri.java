package org.launchcode;
import java.util.Scanner;
//ex B. this is to calculate the area of a rectangle even though I named it CalcAreaTri (oops)
public class CalcAreaTri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle:");
        int length = input.nextInt();

        System.out.println("What is the width of the rectangle:");
        int width = input.nextInt();

        System.out.println("The area of the rectangle is " + length * width);
    }
}
