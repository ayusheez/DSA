//1.class to show speed and brand- "Toyota is driving at 80km/h"
// class Car{
//     int speed;
//     String brand;

//     void carInfo(){
//         System.out.println(brand + " is driving at "+ speed + "km/h");
//     }

// }
// public class class2 {
//     public static void main(String args[]){
//         Car obj=new Car();
//         obj.speed=80;
//         obj.brand="Toyota";

//         obj.carInfo();


//     }
    
// }


//2.Create a Book class with title and author Create 2 objects and print their details
// class Book{
//   String book;
//   String Author;

//   void bookList(){
//     System.out.println(book + " is written by " + Author);
//   }

// }
// public class class2{
//   public static void main(String args[]){
//     Book obj=new Book();
//     Book obj1=new Book();
//     obj.book="Marriage of Convenience";
//     obj.Author="RainaLove";
//     obj.bookList();
//     obj1.book="Burning Desire";
//     obj1.Author="unknown";
//     obj1.bookList();
//   }

// }

//3.Create a BankAccount class
    //variables: accountNumber, balance
    //methods: deposit(), withdraw(), displayBalance()
    // class bankAccount{
    //    int accountNumber;
    //    int balance;
       

    //    void deposit(){
    //     System.out.println("Money is deposited from the account:" + accountNumber);

    //    }
    //    void balance(){
    //     System.out.println("Remaining balance:" + balance);

    //    }

    //    void withdraw(){
    //     System.out.println("Withdrawal Option is not Available");

    //    }
    //    void displayBalance(){
    //     System.out.println("Balance is showed above");

    //    }

    // }
    // class class2{

    //   public static void main(String args[]){

    //     bankAccount obj= new bankAccount();
    //     obj.accountNumber=123456789;
    //     obj.balance=69;
    //     obj.deposit();
    //     obj.balance();
    //     obj.withdraw();
    //     obj.displayBalance();


    //   }

    // }
//4.Create a Student class
    //name, marks
    //method to check pass/fail
    // class Student{
    //   String  name;
    //   int marks;

    //   void check(){
    //     if(marks>=45){
    //       System.out.println(name + " is passed");
    //     }
    //     else{
    //       System.out.println(name + " is failed");
    //     }
    //   }
    // }
    // class class2{
    //   public static void main(String args[]){
    //     Student obj=new Student();
    //     Student obj1=new Student();
    //     obj.name="Ayushi Gautam";
    //     obj.marks=40;
    //     obj1.name="Arshia Chandarki";
    //     obj1.marks=90;

    //     obj.check();
    //     obj1.check();


    //   }
    // }


//5.create a Rectangle class
  // length, breadth
  // method to calculate area
  class Rectangle{
    double length;
    double breadth;
    double area=length*breadth;

    void area()
    {
      System.out.println("Area of "+ length + " and " + breadth+ " is "+ area);
    }


  }
class class2{
  public static void main( String args[]){
    Rectangle obj=new Rectangle();
    obj.length=20;
    obj.breadth=60;
    obj.area();
    obj.area();


  }
}
//6.Create a Laptop class
   //brand, price
   //method to check if price > 50,000

//7.Create a ToDoTask class
//taskName, isCompleted
//method markCompleted()

//8.Create a BankAccount class
//variables: accountNumber, balance
//methods: deposit(), withdraw(), displayBalance()



