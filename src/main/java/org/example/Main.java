package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                double areaC = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f",areaC);
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                double areaT = calculateTriangleArea(base,height);
                System.out.printf("Area of the triangle: %.2f",areaT);
                break;
            case 3:
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                double areaR = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f",areaR);
                break;
            default:
                System.out.println("Invalid number");
        }
    }
    public static double calculateCircleArea( double radius){
        return Math.PI * radius * radius;

    }
    public static double calculateTriangleArea( double base, double height){
        return 0.5 * base * height;

    }
    public static double calculateRectangleArea( double length, double width){
        return length * width;
    }
}