import java.util.Scanner;


public class ComputeAverage {

    public static void main(String[] args) {
        // initialize a scanner object
        Scanner input = new Scanner(System.in);
        //declaring thrree variables to hold our numbers
        double num1, num2, num3;
        // asking for input
        System.out.print("Please enter 3 numbers: ");
        //intitializing our three number variables with values

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        // calculating average
        double avg = ((num1 + num2 + num3) / 3);
        // printing results to the console.
        System.out.println("Your average is: " + avg);


    }

}