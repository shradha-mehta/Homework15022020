package homework15022020;

import java.util.Scanner;

public class LowerCaseString {

    public static void main(String[] args) {

        // declaration of variable

        String a;
        String b;

        // creation of scanner object

        Scanner scan = new Scanner (System.in);

        // calling variable  through scanner

        System.out.println("Enter The String in uppercase : ");

        a = scan.nextLine();

        // creation of formula
        b = a.toLowerCase();

        // print statement
        System.out.println("The Lower case of the String is : " + b);

    }
}







