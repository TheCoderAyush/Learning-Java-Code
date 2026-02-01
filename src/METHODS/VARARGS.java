package METHODS;

public class VARARGS {
    // Using Varargs to take multiple value
    //Varargs act as array
    static void sum(int...arr){
        int result=0;
        for (int i=0; i<arr.length;i++ ){
            result=result+arr[i];
        }
        System.out.println("Sum of the numbers are:- "+result);
    }
    static void sum2(int a, int...arr){//Compulsory give one variables
        int result=0;
        for (int i=0; i<arr.length;i++ ){
            result=result+a+arr[i];
        }
        System.out.println("Sum of the numbers are:- "+result);
    }
    public static void main(String[] args) {
        System.out.println("Calculating sum of numbers using varargs ");
        sum(2,3);
//        sum(2,45,6,7,8,-50);
        sum();
        sum2(1,5,9,-14);

    }
}
