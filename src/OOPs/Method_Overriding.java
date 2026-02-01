package OOPs;
class A{
    public void method1(){
        System.out.println("Hello I am Method One..");
    }
}
class B extends A{
    @Override
    public void method1(){
        System.out.println("Hello I am in Inherited Class..");
    }
    public void method2(){
        System.out.println("HEllo I am Method 2");
    }
}

// Questions
// Question:- 1
class circle1{
    int radius;
    int height;
       public void area1(int radius){
           double area = 3.14*radius*radius;
           System.out.println("Area of the circle:- "+area);
       }
       public void volmune1(){
           System.out.println("circle has no volume");
       }
}
class Cylinder1 extends circle1{
    public void area1(int radius, int height){
        double area = 2*3.14*radius*(height+radius);
        System.out.println("Area of Cylinder:- "+ area);
    }
    public void volmune1(int radius, int height){
        double volmune=3.14*radius*radius*height;
        System.out.println("Volume of the Cylinder:- "+volmune);
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        B obj =new B();
        obj.method1();
        obj.method2();
        A obj2= new A();
//        obj2.method1();
        // questions

        Cylinder1 cyl = new Cylinder1();
        cyl.area1(2,2);
        cyl.volmune1(2,3);

    }
}
