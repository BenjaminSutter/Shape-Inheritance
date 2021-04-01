/*
 * File: Shape.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Holds the parent class of the hierarchy. Contains the method to parse user input.
 */
package project1;

import java.util.Scanner;

abstract class Shape extends Object {

    private int numberOfDimensions;

    //Lets child classes to set numberOfDimensions
    protected void setNumberOfDimensions(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    //Returns a string to child with number of dimensions
    protected String getNumberOfDimensions() {
        return "\nA " + this.getClass().getSimpleName() + " has " + numberOfDimensions + " dimensions";
    }

    /*This method is used to parse user input to doubles (used for shape dimensions)
    If the input is invalid, then prompt the user to retry until valid*/
    protected double parseInput(String outgoingMessage) {

        //Print the outgoing message to inform user of what dimension is being used.
        System.out.println("\n" + outgoingMessage);
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        while (true) {
            //Try to parse input into a valid number
            try {

                double number = Double.parseDouble(userInput);
                if (number > 0) {
                    return number;//Breaks the while loop upon valid input
                } else {
                    System.out.println("\nThe value can't be negative, please try again");
                }
                //If parseDouble failes, inform the user    
            } catch (NumberFormatException e) {
                System.out.println("\n" + userInput + " is not a valid selection."
                        + " Input must be a positive decimal or integer, please try again");
            }
            userInput = scan.nextLine();//If input is invalid, try again
        }//End while

    }
}
