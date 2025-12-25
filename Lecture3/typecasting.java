
// import java.util.Scanner;

// public class TypeCasting {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer:");
//         int input = scanner.nextInt();

//         // typecasting to float
//         double floatValue = (double) input;
//         System.out.println("Typecasted float value: " + floatValue);
//         int number = 'k' + 'y' + 'a' + 'r' + 'e' + '?';
//         System.out.println(number);
//     }
// }


import java.util.Scanner;
public class typecasting {
    
    public static void main(String args[]){

        System.out.println("Enter an integer");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        //Typecasting
        Double floatValue=(double)input;
        System.out.println("Typecasted value" + floatValue);

        int number='k'+'y'+'a'+'r'+'e'+'y';
        System.out.println(number);
    
    }
}