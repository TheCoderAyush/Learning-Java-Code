package METHODS;

public class METHODS {
    public static void main(String[] args) {
        int y =9;
        int x =10;
        int c;
         c=sum(x,y); // Using static function
        System.out.println(c);
        METHODS obj= new METHODS();// Through object creation
        int q=10,w=20;
        int d= obj.sum2(q,w);
        System.out.println(d);

    }
    static int sum(int a, int b){
        int c;
        if (a<b){
            return c= a+b;
        }else {
            c = (a+b)*10;
            return c;
        }
    }
    int sum2(int a,int b){
        int z;
        z=(a+b*2)*2;
        return z;
    }

}
