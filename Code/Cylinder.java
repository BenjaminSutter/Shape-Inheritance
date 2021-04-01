/*
 * File: Cylinder.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the volume of a Cylinder.
 */
package project1;

public class Cylinder extends ThreeDimensionalShape {

    private double radius;
    private double height;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Cylinder() {
        radius = parseInput("What is the radius?");
        height = parseInput("What is the height?");
        //Sets the volume based on calculations preformed for volumeOfCylinder
        setVolume(volumeOfCylinder());
        displayVolume();//Displays the calculated volume for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double volumeOfCylinder() {
        return Math.pow(radius, 2) * Math.PI * height;//Volume is PI(Radius^2) * height
    }
}
