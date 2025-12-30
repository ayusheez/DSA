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
class Book{
  String book;
  String Author;

  void bookList(){
    System.out.println(book + " is written by " + Author);
  }

}
public class class2{
  public static void main(String args[]){
    Book obj=new Book();
    Book obj1=new Book();
    obj.book="Marriage of Convenience";
    obj.Author="RainaLove";
    obj.bookList();
    obj1.book="Burning Desire";
    obj1.Author="unknown";
    obj1.bookList();
  }

}
//3.Create a BankAccount class
    //variables: accountNumber, balance
    //methods: deposit(), withdraw(), displayBalance()
//4.Create a Student class
    //name, marks
    //method to check pass/fail
//5.create a Rectangle class
  // length, breadth
  // method to calculate area

//6.Create a Laptop class
   //brand, price
   //method to check if price > 50,000

//7.Create a ToDoTask class
//taskName, isCompleted
//method markCompleted()

//8.Create a BankAccount class
//variables: accountNumber, balance
//methods: deposit(), withdraw(), displayBalance()



