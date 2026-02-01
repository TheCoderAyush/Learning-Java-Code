package OOPs;
class Base1{
    Base1(){
        System.out.println("i am First Constructor");
    }
    Base1(int x){
        System.out.println("i am in base "+x);
    }
    Base1(String name){
        System.out.println("I am name in Base: "+ name);
    }
}
class derivedd extends Base1{
    derivedd(){

        System.out.println("i am derived Constructor");

    }  derivedd(int x,int y){
        super(x);
        System.out.println("i am in derived Constructor"  +y);
    }
    derivedd(String name, String name2){
        super(name);
        System.out.println("My name in derived constructor:"+name2);
    }
}
class childOfDerived extends derivedd{
    childOfDerived(){
        System.out.println("I am child of derived constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.printf(" i am in child of derived constructor %d ,%d ,%d ",x,y,z);
    }
    childOfDerived(String name, String name2, String name3){
        super(name, name2);
        System.out.println("My name in child of derived Constructor: "+name3);
    }
}

public class Construcyot_in_Inheritance {
    public static void main(String[] args) {
//        Base1 obj = new Base1();

//        derivedd obj2=new derivedd();

//        derivedd obj3=new derivedd(2,3);

//        childOfDerived obj5=new childOfDerived();
//
//        childOfDerived obj4=new childOfDerived(1,2,3);

//        derivedd obj6 = new derivedd("Ayush","Mishra");

        childOfDerived obj7= new childOfDerived("Ayush", "Aryan","Sunny");
    }
}
