import java.util.Scanner;
public class pattern1 {
    public static void main(String args[]){
    
        //  1.BAsic- take user input and print pattern [**********]
        // Scanner scanner=new Scanner(System.in);
        // System.out.print("Enter n:");
        // int n=scanner.nextInt();
        // for(int i=0;i<=n;i++){
        //     System.out.print("*"+ " ");
        // }

        //  2.BAsic- take user input and print pattern [**********]in vertical
        int n=5;
        for(int i=0;i<=n;i++){
            System.out.println("*");
        }
        //4.i,j
        for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
        System.out.print("*");
        }System.out.println();
        }
        // 3.triangle 1
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 3.triangle 2
        for (int k=0;k<=n;k++){
            for(int j=0;j<=n;j++){
                System.out.print("Hi Ayushi Gautam Here");
            }
            System.out.println();
        }
        // 3.triangle 3
        // 3.triangle 4
        


    }
    
}
