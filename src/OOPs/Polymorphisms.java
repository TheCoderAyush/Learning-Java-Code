package OOPs;

interface Phone{
    void calling();
    void rejecting();
}
class SmartPhone implements Phone{
    public void calling(){
        System.out.println("Calling....");
    }
    public void rejecting(){
        System.out.println("Rejecting Call.....");
    }
}
 interface  camera extends Phone{
    void selfie();
    void fourK();

}
class Mycamera implements camera{
    public void selfie(){
        System.out.println("Taking Selfie....");
    }
    public void fourK(){
        System.out.println("Recording in 4K....");
    }
  public   void calling(){
      System.out.println("no feature");
  };
   public void rejecting(){
        System.out.println("NO feature");
    };
}

public class Polymorphisms {
    public static void main(String[] args) {
        Mycamera obj = new Mycamera();
        obj.selfie();
        obj.fourK();
    }
}
