package homework15022020;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int num;
        int sum =0;
        int rem;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input an Integer : ");

        num = scan.nextInt();

        while (num>0) {

            rem = num%10;
            sum = sum + rem;
            num = num/10;

        }
        System.out.println("Sum of Digits is : " +sum);


    }
}



