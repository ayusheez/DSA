import java.util.Scanner;

public class function2 {

    public static void main(String args[]){
    
    }
    //Function to print hello
    void greet(){
        System.out.println("HEllo Worldss");
    }
    // Function to add two numbers
    void sum(){
        int num1=90;
        int num2=90;
        int sum=num1+num2;
        System.out.println(sum);
    }
    // Function to check even/odd
    void check(){
        int n=2;
        if(n%2==0){
            System.out.println("Even Number");

        }
        else
        {
            System.out.println("Odd number");
        }
    }
    
    // Function to find square of number
    void square(){
        System.out.println("Enter number to find square");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int square=n*n;
        System.out.println("Square of "+ n + "is:"+ square);
        
    }

   // Function to convert Celsius → Fahrenheit 
    
}
