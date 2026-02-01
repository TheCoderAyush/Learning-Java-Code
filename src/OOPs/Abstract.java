package OOPs;

abstract class Parent{
    Parent(){
        System.out.println("I am Constructor of Parent ");
    }
   abstract void sayHello();
    abstract void greet();
}

class child1 extends Parent{
   public void sayHello(){
        System.out.println("Hello..");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
 abstract class child2 extends Parent{
    void sayHello(){
        System.out.println("chal na be bsdk");
    }
    void greet(){
        System.out.println("chal na be chutiye");
    }
}
public class Abstract {
    public static void main(String[] args) {

        Parent obj = new child1();
        obj.greet();
        obj.sayHello();
    }
}
