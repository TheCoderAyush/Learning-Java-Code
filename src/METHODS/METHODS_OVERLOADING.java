package METHODS;

public class METHODS_OVERLOADING {
        //Same function different parameter
    static void foo(){
        System.out.println("Helllo Bro");
    }
    static void foo(int a){
        System.out.println("Helllo Bro "+a);
    }
    static void foo(int a, int b){
        System.out.println("Helllo Bro "+a +"and " +b);
        int c=a+b;
        System.out.println(c);
    }
    static void foo(int a, int b, int c, int d){
        System.out.println("Helllo Bro "+a+b+c+d);
    }

    public static void main(String[] args) {
        System.out.println("Printing Function ");
        foo();
        foo(300);
        foo(200, 400);
        foo(100,1000,1000,100000);
        foo(20000,-45555);

    }
}
