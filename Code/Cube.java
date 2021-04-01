/*
 * File: Cube.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the volume of a Cube.
 */
package project1;

public class Cube extends ThreeDimensionalShape {

    private double side;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Cube() {
        side = parseInput("How long is a side?");
        //Sets the volume based on calculations preformed for volumeOfCube
        setVolume(volumeOfCube());
        displayVolume();//Displays the calculated volume for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double volumeOfCube() {
        return Math.pow(side, 3); //Volume of square is side cubed
    }
}
