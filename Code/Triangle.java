/*
 * File: Triangle.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the area of a triangle.
 */
package project1;

public class Triangle extends TwoDimensionalShape {

    private double base;
    private double height;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Triangle() {
        base = parseInput("What is the base?");
        height = parseInput("What is the height?");
        //Sets the area based on calculations preformed for areaOfTriangle
        setArea(areaOfTriangle());
        displayArea();//Displays the calculated area for user to see
    }

    private double areaOfTriangle() {
        return (base * height) / 2;//Area of triangle is half of base*height
    }
}
