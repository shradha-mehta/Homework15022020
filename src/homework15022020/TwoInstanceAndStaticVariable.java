package homework15022020;

public class TwoInstanceAndStaticVariable {
    int a = 50; // instance variable
    int b = 70; // instance variable
    static int c = 80; // static variable
    static int d = 60; // static variable

    public static void main(String[] args) {//main method

        TwoInstanceAndStaticVariable ref = new TwoInstanceAndStaticVariable();
        //object created to call instance method

        ref.call();

        call1(); //called direct static method in main static method
    }

    //instance method
    public void call() {

        System.out.println(a); // instance variable calling direct to instance method
        System.out.println(b); // instance variable calling direct  to instance method
        System.out.println(TwoInstanceAndStaticVariable.c);//static  variable calling to instance method using class name
        System.out.println(TwoInstanceAndStaticVariable.d);//static variable calling to instance method using class name
    } //static method

    public static void call1() {
        TwoInstanceAndStaticVariable ref1 = new TwoInstanceAndStaticVariable();
        //object created calling instance to static

        System.out.println(ref1.a);// printing instance variable
        System.out.println(ref1.b);// printing instance variable
        System.out.println(c); //direct calling static to static and printing
        System.out.println(d); //direct calling static

    }
}