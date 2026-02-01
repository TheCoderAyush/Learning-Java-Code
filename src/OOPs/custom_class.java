package OOPs;

class Employee{
    // Attribute

    int id;
    String Name;
    int salary;

  public int getSalary(){
      return salary;
  }
  public String getName(){
      return Name;
  }
  public void setName( String name){
        Name=name;
    }

}
class cellPhone{
    public void ringing(){
        System.out.println("Phone is ringing......");
    }
    public void vibrating(){
        System.out.println("Phone is vibrating....");
    }
}

class square{
    int side;
    public void area(){
        System.out.println("The area of Square: " +(side*side));
    }
    public void perimeter( ){
        System.out.println("The Perimeter of Square: "+(4*side));
    }
}
class TommyVecetti{
    String rockStar;
    public void hitting(){
        System.out.println( rockStar+" is Hiting....");
    }public void running(){
        System.out.println(rockStar+" is running....");
    }public void firing(){
        System.out.println( rockStar+" is firing....");
    }
}

// Use of the Getters and Setters
class MyEmployee{
    private int id;
    private String name;
     public void setName(String n){
         name =n;
     }
     public String getName(){
         return name;
     }
     public void setId(int i){
         id=i;
     }
     public int getId(){
         return id;
     }

}
class circle{
    private int radius;
    private float area;
    private float perimeter;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }
}

public class custom_class {
    public static void main(String[] args) {
        //Object creation
        Employee em2 = new Employee();
        Employee obj = new Employee();
        Employee em3 = new Employee();

        em2.Name="ayush";
        String Name = em2.getName();
        System.out.println(Name);

        em2.salary =2450;
        int salary=em2.getSalary();
        System.out.println(salary);


       em2.setName("No body");

       //ques2
        System.out.println();
        cellPhone phone=new cellPhone();
        phone.ringing();
        phone.vibrating();

        //ques3
        System.out.println();
        square sides= new square();
        sides.side=4;
        sides.area();
        sides.perimeter();

        //ques4
        System.out.println();
        TommyVecetti bro = new TommyVecetti();
        bro.rockStar="Tommy";
        bro.hitting();
        bro.firing();
        bro.running();

        //Getters and Setters
        MyEmployee em4 = new MyEmployee();
        em4.setId(234);
        em4.setName("Ayush");
        System.out.println(" name of the employee is : "+em4.getName());
        System.out.println(" id of the employee is : "+em4.getId());

        // RAndomQustion
        circle cir =new circle();
        cir.setRadius(5);
        cir.setArea(23);
        cir.setPerimeter(45);
        System.out.println(cir.getArea());
    }
}
