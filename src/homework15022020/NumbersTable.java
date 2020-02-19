package homework15022020;

import java.util.Scanner;

public class NumbersTable {

    // creation of main method
    public static void main(String[] args) {

        int number; // Declaration of data tye

        Scanner scan = new Scanner(System.in); // creating scanner object

        System.out.println("Enter the Number : "); // printing statement for number

        number = scan.nextInt(); // calling number with scanner

        for (int i =1;i <=10; i++)
        System.out.println(number + " X " + i + " = " + number * i);


    }
}



