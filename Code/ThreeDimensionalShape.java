/*
 * File: ThreeDimensionalShape.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the volume attribute used in child classes and the method to display it.
 */
package project1;

import java.text.DecimalFormat;

abstract class ThreeDimensionalShape extends Shape {

    private double volume;

    //Default constructer sets number of dimensions for call in displayArea()
    protected ThreeDimensionalShape() {
        setNumberOfDimensions(3);
    }

    //Allows child classes to set the volume
    protected void setVolume(double volume) {
        this.volume = volume;
    }

    //Allows children classes to display the volume
    protected void displayVolume() {
        DecimalFormat df2 = new DecimalFormat("###,###.##");
        /*Prints name of the shape with the decimal formatted volume 
        and number of dimensions from shape parent class*/
        System.out.println(getNumberOfDimensions() + ", its volume is " + df2.format(volume));
    }
}
