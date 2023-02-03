/**
 * @Class: Circle
 * @Author: Michaela  Haney
 * @Version: 1.0
 * @Course: ITEC 2140- 05, Spring 2023
 * @Written: 2 February 2023
 * Description: Write a program calculates the area
 * and perimeter of a circle
 * that has a radius of 9.5
 * using the following formula:
 * area = radius * radius * Math.PI
 * perimeter = 2 * radius * Math.PI
 */

public class Circle {
    public static void main (String []args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        String calculate = ("Find the area: ");
        String display = ("Find the perimeter: ");
        System.out.println(area );
        System.out.println(perimeter );

    }
}
