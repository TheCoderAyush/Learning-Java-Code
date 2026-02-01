package OOPs;


class base{
    int x;

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends base{//inheritance
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
class Animal{
    public void running(){
        System.out.println("running...");
    }
    public void walking(){
        System.out.println("Walking...");
    }
}
class Dog extends Animal{
    public void barking(){
        System.out.println("Barking....");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        base obj =new base();
        obj.setX(2);
        System.out.println(obj.getX());
        Derived obj2=new Derived();
        obj2.setY(3);
        System.out.println(obj2.getY());
        obj2.setX(4);
        System.out.println(obj2.getX());

        //question
        Dog dog=new Dog();
        dog.walking();
        dog.running();
        dog.barking();
    }

}
