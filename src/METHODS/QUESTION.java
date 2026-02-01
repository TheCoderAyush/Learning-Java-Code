package METHODS;



public class QUESTION {
    static int printPattern(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        return 0;
    }
    static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        int c=n*factorial(n-1);
        return c;
    }
//    Write a method isEven(int number) that returns
//    true if the number is even, otherwise false.
    static boolean isEven(int number){
        if (number%2==0){
            return true;
        }else
            return false;
    }
//    Write a method countVowels(String text) that returns
//    the number of vowels in a string.
    static void countVowels(String text){
        int vowels=0;
        int length=0;
        text = text.toLowerCase();

      for (int i=0; i<text.length(); i++){
        length++;
        char ch=text.charAt(i);
        if (ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o'){
            vowels++;
        }
      }
        System.out.println("The number of vowels in the String is: "+vowels);

        System.out.println("The Length of the String is: "+length);
    }
    public static void main(String[] args) {
        printPattern();
        int fact=factorial(5);
        int fact2= factorial(6);
        System.out.println("Factorial = "+fact);
        System.out.println("Factorial = "+fact2);
        System.out.println("the is number is:- "+ isEven(4));
        System.out.println("the is number is:- "+ isEven(5));
        countVowels("Ayush");
    }
}
