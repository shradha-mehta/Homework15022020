package homework15022020;

import java.util.Scanner;

public class Area {

           public static void main(String[] args) { // declaration of main method

            double radius; // radius data types
            double pi = 3.14; // pi data types
            double Area; // area data types

            Scanner scan = new Scanner(System.in); // create scanner

            radius = scan.nextDouble(); // calling radius variable

            Area = pi * radius * radius; // using formula

            System.out.println("Area Of Circle:" + Area); // printing statement for area


        }


    }



