/*
 * File: Circle.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the area of a circle.
 */
package project1;

public class Circle extends TwoDimensionalShape {

    private double radius;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Circle() {
        radius = parseInput("What is the radius?");
        //Sets the area based on calculations preformed for areaOfCircle
        setArea(areaOfCircle());
        displayArea();//Displays the calculated area for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double areaOfCircle() {
        return Math.pow(radius, 2) * Math.PI;//Area of circle is Pi*(Radius^2)
    }
}
