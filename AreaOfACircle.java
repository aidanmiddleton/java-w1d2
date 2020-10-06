import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        // setting a constant value for pi
        final double pi = 3.14159;

        // initialize a new Scanner object
        Scanner input = new Scanner(System.in);
        // asking for input
        System.out.print("Please Enter a Radius: ");
        // take in that input
        double radius = input.nextDouble();
        // calculate and print the result
        System.out.println("the area of your circle is: " + (radius * radius * pi));



    }


}