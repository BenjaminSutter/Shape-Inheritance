/*
 * File: Rectangle.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the area of a rectangle.
 */
package project1;

public class Rectangle extends TwoDimensionalShape {

    private double length;
    private double width;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Rectangle() {
        length = parseInput("What is the length?");
        width = parseInput("What is the width?");
        //Sets the area based on calculations preformed for areaOfRectangle
        setArea(areaOfRectangle());
        displayArea();//Displays the calculated area for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double areaOfRectangle() {
        return length * width;//Area of rectangle is length*width
    }
}
