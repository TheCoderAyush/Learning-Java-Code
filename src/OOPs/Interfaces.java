package OOPs;

interface bicycle{
      void helo();
     void applyBreak(int decreament);
    void speedUp(int increament);


}
interface motorcycle{
    void petrol();
    void notPetrol();
}
class AvonCycle implements bicycle,motorcycle{
    int speed=4;
  public    void applyBreak(int decreament){
      speed = speed - decreament;
      System.out.println(speed);
    }
   public void speedUp(int increament){
        speed=speed+increament;
    }
    public void helo(){
        System.out.println("hello");
    }
    public void petrol(){
        System.out.println("I am petrol Vehicle");
    };
   public   void notPetrol(){
       System.out.println("I am petrol Vehicle not");
   };
}
public class Interfaces {
    public static void main(String[] args) {

       motorcycle cycle = new AvonCycle();
//        cycle.applyBreak(3);
//        cycle.helo();
        cycle.petrol();
    }
}
