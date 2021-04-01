/*
 * File: Sphere.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the volume of a Sphere.
 */
package project1;

public class Sphere extends ThreeDimensionalShape {

    private double radius;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Sphere() {
        radius = parseInput("What is the radius?");
        //Sets the volume based on calculations preformed for volumeOfSphere
        setVolume(volumeOfSphere());
        displayVolume();//Displays the calculated volume for user to see
    }

    //Rather than passing parameters, simply access the class attribute directly
    private double volumeOfSphere() {
        return Math.pow(radius, 3) * Math.PI * 4 / 3;//Area of a sphere is (Radius^3) * 4/3PI
    }
}
