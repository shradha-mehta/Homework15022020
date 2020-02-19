public class TwoStaticVariable {
    static int a = 30;
    static int b = 40;
    public void method (){
        System.out.println(a);
        System.out.println(b);
    }


    public static void main (String[]args){
        TwoStaticVariable obj = new TwoStaticVariable();
        obj .method();

    }

}
