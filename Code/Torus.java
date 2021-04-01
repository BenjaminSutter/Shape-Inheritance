/*
 * File: Torus.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the volume of a Torus.
 */
package project1;

public class Torus extends ThreeDimensionalShape {

    private double minorRadius;
    private double majorRadius;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Torus() {
        minorRadius = parseInput("What is the minor radius?");
        majorRadius = parseInput("What is the major radius?");
        //Sets the volume based on calculations preformed for volumeOfTorus
        setVolume(volumeOfTorus());
        displayVolume();//Displays the calculated volume for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double volumeOfTorus() {
        //Volume of a torus is (Pi * minor radius^2) * (2Pi * major radius)
        return Math.pow(minorRadius, 2) * Math.PI * (2 * Math.PI * majorRadius);
    }
}
