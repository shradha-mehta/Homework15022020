package homework15022020;


import java.util.Scanner;

public class Calculator {
public static void main (String []args){
        //scanner object created
        Scanner scan = new Scanner(System.in);
        int a;//data types for addition
        int b;//data types for addition
        System.out.println("Enter First Number to do Addition ");
        //printing for first statement
        a = scan.nextInt();
        System.out.println("Enter Second Number to do Addition");
        //printing for second statement
        b = scan.nextInt();
        int c; //data types for subtraction
        int d; //data types for subtraction
        System.out.println("Enter First Number to do Subtraction");
        c = scan.nextInt();
        System.out.println("Enter Second Number to do Subtraction");
        d=scan.nextInt();
        int e; // data types for multiplication
        int f; // data types for multiplication
        System.out.println("Enter the First Number to do Multiplication");
        e=scan.nextInt();
        System.out.println("Enter the Second Number to do Multiplication");
        f = scan.nextInt();
        int g; // data types for division
        int h; // data types for division
        System.out.println("Enter the First Number to do Division");
        //printing for first statement
        g=scan.nextInt();
        System.out.println("Enter the Second Number to do Division");
        //printing for second statement
        h=scan.nextInt();
        Calculator cal =new Calculator();
        cal.add(a,b);
        cal.sub(c,d);
        multi(e,f);
        div(g,h);

        }
//instance method
public void add (int a, int b){
        int result = a + b;
        System.out.println("Value for Addition is" + result);
        }
//instance method
public void sub (int c, int d){
        int result1 = c-d;
        System.out.println("Value for Subtraction is"+ result1);
        }
//static method
public static void multi(int e, int f){
        int result2 =e*f;
        System.out.println("Value for Multiplication is "+ result2);
        }
//static method
    public static void div (int g, int h){
    int result3 =g/h;
        System.out.println("Value for Division is " + result3);
    }

        }
