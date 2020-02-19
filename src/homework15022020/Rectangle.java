package homework15022020;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double Width;
        double Height;
        double Area;
        double Perimeter;

        Scanner scan = new Scanner (System.in);

        System.out.println("Please Enter the Width : ");
        Width = scan.nextDouble();

        System.out.println("Please Enter the Height : ");
        Height = scan.nextDouble();

        Area = Width*Height;
        Perimeter = 2*(Width+Height);
        System.out.println("The Area of Rectangle is = "+ Area);
        System.out.println(" The Perimeter of Rectangle is = "+Perimeter);




    }
}



