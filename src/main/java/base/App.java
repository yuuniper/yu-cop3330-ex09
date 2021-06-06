/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges
Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.

 */

public class App {
    Scanner in = new Scanner(System.in);
    public static int CONVERSION_FACTOR = 350;

    public static void main(String[] args)
    {
        App myApp = new App();

        int length = myApp.readInput("What is the length of the room in feet? ");
        int width = myApp.readInput("What is the width of the room in feet? ");

        int areaFeet = length * width;

        int numGallons = areaFeet / CONVERSION_FACTOR;

        if (areaFeet % CONVERSION_FACTOR != 0)
        {
            numGallons++;
        }

        String outputString = ("You will need to purchase " + numGallons +
                " gallons of paint to cover " + areaFeet + " square feet.");
        myApp.printOutput(outputString);
    }

    public int readInput(String input)
    {
        System.out.print(input);
        String num = in.next();
        int convertNum = Integer.parseInt(num);

        return convertNum;
    }

    public void printOutput(String input)
    {
        System.out.println(input);
    }
}
