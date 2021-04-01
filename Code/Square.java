/*
 * File: Square.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the area of a square.
 */
package project1;

public class Square extends TwoDimensionalShape {

    private double side;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Square() {
        side = parseInput("How long is a side?");
        //Sets the area based on calculations preformed for areaOfSquare
        setArea(areaOfSquare());
        displayArea();//Displays the calculated area for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double areaOfSquare() {
        return side * side;//Area of square is side squared
    }
}
