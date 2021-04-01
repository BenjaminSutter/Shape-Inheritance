/*
 * File: Project1.java
 * Author: Ben Sutter
 * Date: March 23rd, 2021
 * Purpose: Create a command line driven menu to allow the user to create various shapes
 */
package project1;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Project1 {

    //Stores the menu options in a method for easy access.
    public void displayMenu() {
        System.out.println("\nPlease select an option from the menu below"
                + "\n1. Construct a Circle"
                + "\n2. Construct a Rectangle"
                + "\n3. Construct a Square"
                + "\n4. Construct a Triangle"
                + "\n5. Construct a Sphere"
                + "\n6. Construct a Cube"
                + "\n7. Construct a Cone"
                + "\n8. Construct a Cylinder"
                + "\n9. Construct a Torus"
                + "\nQ. Quit program");
    }

    public void initializeMenu() {

        System.out.println("*********Welcome to the Java OO Shapes Program **********");
        displayMenu(); //Display menu choices
        //Create scanner to read user input
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        //While user input isn't equal to Q (quit) then loop
        while (!userInput.trim().equalsIgnoreCase("q")) {

            switch (userInput) {
                case "1"://Circle
                    System.out.println("\nYou have chosen to create a Circle");
                    Circle circle = new Circle();
                    break;
                case "2"://Rectangle
                    System.out.println("\nYou have chosen to create a Rectangle");
                    Rectangle rectangle = new Rectangle();
                    break;
                case "3"://Square
                    System.out.println("\nYou have chosen to create a Square");
                    Square square = new Square();
                    break;
                case "4"://Triangle
                    System.out.println("\nYou have chosen to create a Triangle");
                    Triangle triangle = new Triangle();
                    break;
                case "5"://Sphere
                    System.out.println("\nYou have chosen to create a Sphere");
                    Sphere sphere = new Sphere();
                    break;
                case "6"://Cube
                    System.out.println("\nYou have chosen to create a Cube");
                    Cube cube = new Cube();
                    break;
                case "7"://Cone
                    System.out.println("\nYou have chosen to create a Cone");
                    Cone cone = new Cone();
                    break;
                case "8"://Cylinder
                    System.out.println("\nYou have chosen to create a Cylinder");
                    Cylinder cylinder = new Cylinder();
                    break;
                case "9"://Torus
                    System.out.println("\nYou have chosen to create a Torus");
                    Torus torus = new Torus();
                    break;
                default:
                    System.out.println("That was not a vailid selection, please try again");
                    break;
            }//End switch
            //Display menu again and allow the user to input again
            displayMenu();
            userInput = scan.nextLine();
        }//End while

        //From: https://stackabuse.com/how-to-get-current-date-and-time-in-java/
        Date date = new Date(); // This object contains the current date value
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMM dd, yyyy 'at' HH:mmaa");//Formats the date
        //Thanks the user for using the program and displays the date
        System.out.println("\nThank you for using the program! \nThe current date and time is " + formatter.format(date));

    }

    public static void main(String[] args) {
        Project1 proj = new Project1();
        proj.initializeMenu();
    }
}
