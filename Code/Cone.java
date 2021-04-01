/*
 * File: Cone.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the method to calculate the volume of a Cone.
 */
package project1;

public class Cone extends ThreeDimensionalShape {

    private double radius;
    private double height;

    /*Rather than passing parameters, parse the input within the constructor.
    After parsing input, set the area from the parent class and display it.*/
    public Cone() {
        radius = parseInput("What is the radius?");
        height = parseInput("What is the height?");
        //Sets the volume based on calculations preformed for volumeOfCone
        setVolume(volumeOfCone());
        displayVolume();//Displays the calculated volume for user to see
    }

    //Rather than passing parameters, simply access the class attributes directly
    private double volumeOfCone() {
        return Math.pow(radius, 2) * Math.PI * (height / 3);//Volume of a cone is PI(Radius^2) * height/3
    }
}
