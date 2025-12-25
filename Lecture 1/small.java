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
// import java.util.Scanner;
// class small{
//     public static void main(String args[])
//     {
//         int num1;
//         int num2;
//         System.out.println("Enter number 1:");
//         Scanner obj1=new Scanner(System.in);
//         num1=obj1.nextInt();

//         System.out.println("Enter number 2:");
//         Scanner obj2=new Scanner(System.in);
//         num2=obj2.nextInt();
        
//         System.out.println("total:" +(num1+num2));
        

//     }
// }

//7. Even odd
// import java.util.Scanner;
// class small{
//     public static void main(String args[]){
//         System.out.print("Enter a number:");
//         Scanner obj=new  Scanner(System.in);
//         int num=obj.nextInt();
//         if(num%2==0)
//         System.out.println("Even number!");
//         else
//         System.out.println("Odd number!");
//     }
// }

//8. check positive negative
// import java.util.Scanner;
// class small{
//     public static void main(String args[]){
//         System.out.println("Check If the number is positive.");
//         System.out.println("Enter a number");
//         Scanner obj=new Scanner(System.in);
//         int num=obj.nextInt();
//         if(num > 0)
//         System.out.println("Positive number");
//         else
//         System.out.println("Negative number");

//     }

// }

//9. for loop 1-5
// import java.util.Scanner;
// class small{
//     public static void main(String args[]){
//         System.out.println("Enter number:");
//         Scanner obj=new Scanner(System.in);
//         int n=obj.nextInt();
//         for(int i=0;i<=n;i++)
//         {
//             System.out.println(i);
//         }
//     }
// }

//10. While loop
// class small{
//     public static void main(String args[])
//     {
//         System.out.println("While Loop");
//         int i=0;
//         while(i<=5)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//11. Simple greet method
// class small{
    
//     public static void main(String args[])
//     {
//      greet();
//     }
//     static void greet(){
//         System.out.println("Ayushi hereeeee");
//     }
// }

//13.Class and object
// class small{
//     String str="Ayushi";
//     public static void main(String args[])
//     {
//         small  s=new small();
//         System.out.println(s.str);
        

//     }
// }

//14. Simple array
class small{
    public static void main(String args[])
    {
        System.out.println("Arrays in java");
        int array[]={1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[4]);

        System.out.println("Different type of array");
        int arr[]=new int[4];
        arr[1]=9;
        arr[2]=8;
        arr[3]=7;
   
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }


}


