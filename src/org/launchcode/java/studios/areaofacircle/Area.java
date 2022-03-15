package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner input = new Scanner(System.in);
        double radius;
        radius = input.nextInt();
        System.out.println(Circle.getArea(radius));
    }

}
