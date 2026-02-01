package OOPs;

// question:- 1
abstract class Pen{
    abstract void Write( String Write);
    abstract void refill();
}
class FoundationPen extends Pen{
    @Override
    void Write(String Write)
    {
        System.out.println("I am Writing.. "+Write);
    }

    @Override
    void refill() {
        System.out.println("Refiling THE Pen....");

    }
    void changeNib(){
        System.out.println("Changing Nib");
    }
}
/// Question:- 2

    class Monkey{
        void jump(){
            System.out.println("Jumping.....");

        }
        void bite(){
            System.out.println("Biting....");

        }
}
     interface BasicAnimals{
        void Eat();
        void Sleep();
}

    class Humans extends Monkey implements BasicAnimals{
            public void Eat(){
                System.out.println("Human is Eating..");
            }
            public void Sleep(){
                System.out.println("Human is Sleeping....");
            }
    }
    // Question:- 3
  abstract class TelePhone{
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
    }
    class SmartTelePhone extends TelePhone{
        void ring(){
            System.out.println("TelePhone is ringing....");
        }
        void lift(){
            System.out.println("TelePhone Lifted...");
        }
        void disconnect(){
            System.out.println("Call is Disconnected...");
        }
    }
// Question:- 4

interface TvRemote{
        void channelNo(int Number);

}
interface SmartTvRemote extends TvRemote{
       void On_off_Automatically();
}
class Tv implements TvRemote,SmartTvRemote{
        public void channelNo(int Number){
            System.out.println("Channel Changes to :- "+Number);
        }
        public void On_off_Automatically(){
            System.out.println("Switching On and Off Automatically..");
        }
}

public class Combined_Questions {
    public static void main(String[] args) {
        //Question:- 1
        FoundationPen obj = new FoundationPen();
        obj.Write("Hey I am Octane");
        obj.refill();
        obj.changeNib();

        // Question:- 2
        Humans obj2 = new Humans();
        obj2.Eat();
        obj2.Sleep();
        obj2.bite();
        obj2.jump();

        // Question:- 3
       TelePhone obj3 = new SmartTelePhone();
       obj3.ring();
       obj3.lift();
       obj3.disconnect();

        // Question:- 4
        System.out.println();
      Tv remote = new Tv();
        remote.channelNo(34);
        remote.On_off_Automatically();
    }
}
