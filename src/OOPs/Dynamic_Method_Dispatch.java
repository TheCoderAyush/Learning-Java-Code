package OOPs;

    class One{
        public void greet(){
            System.out.println("Good Morning u bitch");
        }
        public void name(){
            System.out.println("Name in Class One..");
        }
    }
    class Two extends One{
        public void name(){
            System.out.println("Name in Class Two");
        }
        public void greet2(){
            System.out.println("Good Night..");
        }
    }
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Two two= new Two(); Method Overriding
//        two.name();

        One obj = new Two();
        obj.name();
        obj.greet();
//    obj.greet2  I CANNOT CALL IT
        Two two = new Two();
        two.greet2(); // CALLING THROUGH THIS...
    }
}
