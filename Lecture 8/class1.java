//1.Wriet a class for name and info and show them using display function.
class info{
  String name;
  int age;

  void display(){
    System.out.println("name:"+ name + " \nage:" + age);
  }
}

public class class1 {
    public static void main(String args[]){
        info obj=new info();
        obj.name="Ayushi Gautam";
        obj.age=21;

        obj.display();


    }
    
}
