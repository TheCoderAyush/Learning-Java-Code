package OOPs;

interface sampleInterface{
    void method1();
    void method2();
}
interface MysampleInterface extends sampleInterface{
    void method3();
    void method4();
}
class childIntereface implements MysampleInterface{
   public void method3(){
       System.out.println("I am Method 3");
   }
    public  void method4(){
        System.out.println("I am Method 4");
    };
    public void method1(){
        System.out.println("I am Method 1");
    };
    public void method2(){
        System.out.println("I am Method 2");
    };

}

public class Interference_In_Interface {
    public static void main(String[] args) {
        childIntereface obj = new childIntereface();
        obj.method1();
        obj.method2();
        MysampleInterface obj2 =new childIntereface();

    }
}
