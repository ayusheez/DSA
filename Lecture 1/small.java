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
//         System.out.println("Enter your age:");
//         Scanner obj=new Scanner(System.in);
//         int age=obj.nextInt();
//         if(age>=18)
//         System.out.println("Eligible");
//         else
//         System.out.println("Not eligible");
        
//     }
// }
// import java.util.Scanner;
// class small{
//     public static void main(String args[]){
//         System.out.print("Enter your age:");
//         Scanner obj=new Scanner(System.in);
//         int age=obj.nextInt();
//         if(age>=18)
//         System.out.println("Eligible");
//         else
//         System.out.println("not Eligible hai");
//     }
// }

import java.util.Scanner;
class small{
    public static void main(String args[])
    {
        System.out.print("Enter your age");
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if(age>=18)
        System.out.println("Eligible");
        else
        System.out.println("Not eligible");
    }
}


