package homework15022020;

import java.util.Scanner;

public class FerenhitToCelcius {
    public static void main(String[] args) {

        float Temprature; // data type variable

        Scanner scan = new Scanner(System.in); // creating scanner object

        System.out.println("Enter Temperature in Ferenhit"); // printing statment for ferenhit

        Temprature= scan.nextInt();

        Temprature=((Temprature-32)*5/9);


        System.out.println("Temprature in Celcius :" + Temprature); // calling statement for celcius
    }
}





