// import java.util.ArrayList;
// public class lists{
//     public static void main(String args[]){
//         System.out.println("I have learnt about lists in java now it's the time to implement it!");
//         ArrayList<String> cars=new ArrayList<>();
//         //add
//         cars.add("Volvo");
//         cars.add("Mazda");
//         cars.add("Hyundai");
//         cars.add("Tata");
//         cars.add("Lamberghini");
//         System.out.println(cars);

//         //acces, manipulate/change
//         cars.get(0);
//         cars.set(0,"Toyota");
//         System.out.println(cars);


//         //size
//         cars.size();
//         System.out.println(cars.size());

//         //remove
//         // cars.remove(2);
//         // cars.clear();
//         // System.out.println(cars);

//         //loop
//         for(int i=0;i<cars.size();i++)
//         {
//             System.out.println(cars.get(i));
//         }

//         //for each loop
//         for(String i:cars)
//         {
//             System.out.println(i);
//         }



//     }
// }

import java.util.ArrayList;
public class arrayList {

    public static void main(String args[]){

        System.out.println("ArrayLists");
        ArrayList<String> cars=new ArrayList<>();

        //add
        cars.add("volvo");
        cars.add("Toyota");
        cars.add("Lamborghini");
        cars.add("jagaur");
        cars.add("Mazda");
        cars.add("hyundai");
        cars.add("tata");
        System.out.println(cars);
       

        //access, manipulate/change
        cars.get(0);
        cars.set(0,"Farari");
        System.out.println(cars);

        //size
        cars.size();
        System.out.println(cars.size());
     

        //remove
        cars.remove(5);
        System.out.println(cars);
        cars.clear();
        // System.out.println(cars);
      

        //loop
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));

        }
       

        //for each loop
        // for(String i:cars)
        // {
        //     System.out.println(i);
        // }

    }
    
}
