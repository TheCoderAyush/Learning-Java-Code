package OOPs;

class MyMainEmployee{
    int id;
    String name;

    // Use of constructor
    public MyMainEmployee(){
        id =45;
        name="Ayush";
    }

    // Passing Arguments and Overloaded Constructor
    public MyMainEmployee(String name){
        id =12;
        this.name=name;
    }
    public MyMainEmployee(int ID){
        this.id =ID;
        this.name="Ayush";
    }
    public MyMainEmployee(int ID, String Name){
        this.id =ID;
        this.name=Name;
    }

}

// Question :- 1
class Cylinder{
    float height;
    int radius;

    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public float getHeight(){
        return height;
    }
    // question:-2
    public void surfaceArea(){
        double tsa=2*Math.PI*radius*(height+radius);
        System.out.println("Total Surface area :- "+tsa);
    }
    public void Volume(){
        double volume =Math.PI*radius*radius*height;
        System.out.println("Volmune :- "+volume);

    }
}
//Question:-3
//Repeating Question 1 using constructor
class Cylinder2{
    public Cylinder2(int radius,float height){
        double tsa = 2*Math.PI*radius*(height+radius);
        double vol=Math.PI*radius*radius*height;
        System.out.println("Total Surface area :- "+tsa);
        System.out.println("Volmune :- "+vol);
    }
}

public class constructor {
    public static void main(String[] args) {
        MyMainEmployee employee=new MyMainEmployee();
        System.out.println(employee.id + " and " + employee.name);

        MyMainEmployee e2=new MyMainEmployee("Mafia");
        System.out.println(e2.id + " and " + e2.name);

        MyMainEmployee e3=new MyMainEmployee(34);
        System.out.println(e3.id + " and " + e3.name);

        MyMainEmployee e4=new MyMainEmployee(23,"Pandey ji");
        System.out.println(e4.id + " and " + e4.name);


        //Question :-1
        System.out.println();
        Cylinder cylinder=new Cylinder();
        cylinder.setRadius(2);
        System.out.println("Radius of cylinder:- "+cylinder.getRadius());
        cylinder.setHeight(4);
        System.out.println("Height of cylindeer: "+cylinder.getHeight());
        //Question:-2
        System.out.println();
        cylinder.surfaceArea();
        cylinder.Volume();
        //Question:-3
        System.out.println();
        Cylinder2 cy =new Cylinder2(2,4);
        System.out.println();

    }
}
