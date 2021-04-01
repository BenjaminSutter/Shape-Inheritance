/*
 * File: TwoDimensionalShape.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the area attribute used in child classes and the method to display it.
 */
package project1;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

abstract class TwoDimensionalShape extends Shape {

    private double area;

    //Default constructer sets number of dimensions for call in displayArea()
    protected TwoDimensionalShape() {
        setNumberOfDimensions(2);
    }

    //Allows child classes to set the area
    protected void setArea(double area) {
        this.area = area;
    }

    //Allows children classes to display the area
    protected void displayArea() {
        DecimalFormat df2 = new DecimalFormat("###,###.##");
        /*Prints name of the shape with the decimal formatted area
        and number of dimensions from shape parent class*/
        System.out.println(getNumberOfDimensions() + ", its area is " + df2.format(area));
    }
}
