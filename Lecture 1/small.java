//1. program 1- Simple java program syntax

// public class small {


    
// }

//2.program - Hello world in java
// class small{
//     public static void main(String args[]){
//         System.out.println("Hello World!");
//     }
// }

//3.program- Functions in java
// class small{
//     public static void main(String args[]){
//         greet();

//     }
//     static void greet(){
//         System.out.println("Hello Ayushi ji");
//     }
// }

//4. program- to check voting eligibility
// class small{
//     public static void main(String args[])
//     {
//         int age=18;
//         if(age>=18)
        
//             System.out.println("Eligible to vote");
//         else
//             System.out.println("Does not pass the voting eligibilty criteria");
    
//     }
// }

//5.program- to check the voting eligibility by takig input from the users
// import java.util.Scanner;
// class small{
//     public static void main(String args[]){
//         System.out.print("Enter your age:");
//         Scanner obj=new Scanner(System.in);
//         int age=obj.nextInt();
//         if(age>=18)
//         System.out.println("Eligible to vote");
//         else
//         System.out.println("Not eligible");
//     }
// }
//6. Add two numbers
import java.util.Scanner;
class small{
    public static void main(String args[])
    {
        int num1;
        int num2;
        System.out.println("Enter number 1:");
        Scanner obj1=new Scanner(System.in);
        num1=obj1.nextInt();

        System.out.println("Enter number 2:");
        Scanner obj2=new Scanner(System.in);
        num2=obj2.nextInt();
        
        System.out.println("total:" +(num1+num2));
        

    }
}

//7. Even odd
//8. check positive negative
//9. for loop 1-5
//10. While loop
//11. Simple greet method
//13.Class and object
