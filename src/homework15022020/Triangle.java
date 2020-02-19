package homework15022020;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        double base;
        double height;
        double area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of base: "  );
        base = scan.nextInt();
        System.out.println("Enter the value of height: ");
        height = scan.nextInt();
        area = (base*height)/2;
        System.out.println("Area of Triangle is: " + area);



    }






}


