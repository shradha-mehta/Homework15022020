package homework15022020;

public class OneInstanceStaticVariable {//class name
    int a = 10; // instance variable
    static int b = 20; //static variable

    public static void main(String[] args)

    {//main method
        OneInstanceStaticVariable one1 = new OneInstanceStaticVariable();

        //object created to call instance method
        one1.one();

        //OneInstanceOneStaticVariable.ones();//static method called by using class name as well

                one2();
                //static to static method we can call direct as well in main method
    }
    //instance method

    public void one() {
        System.out.println(a);
        //accessing instance variable directly as instance method
        System.out.println(OneInstanceStaticVariable.b);
        //accessing static variable in instance variable
        // using class name

    }
    //static method
    public static void one2() {
        OneInstanceStaticVariable ob = new
                OneInstanceStaticVariable();//accessing instance variable to static method creating object
        System.out.println(ob.a); //using ob reference printing instance variable
        System.out.println(b);//calling static variable to static



            }


}
