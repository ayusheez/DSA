//git commands-
// git status
// git add .
// git commit -m "likh idhar"
// git push origin main
public class function1 {

    public static void main(String args[]){
        square(2);
        greet();
        arg(2,3);
        ret();
        returns();
        add(8,9);

        
    }

// Write a method that returns the square of a number.
static int square(int x){
    return (x*x);
    
}


// Write one example for each of the 4 method types.
//1.No argument.no return
static void greet(){
    System.out.println("Hello handsome! you ok?");
}
//2.Argument and no return
static void arg(int a,int b){
    a=10;
    b=20;
    int c=a+b;
    System.out.println(c);

}
//3.No argument but return value
static int ret(){
    return 10;

}
static String returns(){
    return "Yeahhhhh String vala return samajh gaya";
}

//4.Return and Argument
static int add(int a , int b){
    return a+b;
}

// Predict the output of a method that has a return in the middle.


// Trace the execution order of two methods calling each other.

// Write a method that takes two numbers and prints their average.

// Find and fix a scope-related error in a method.

// Predict output to prove Java is pass by value.
static void change(int x){
    x=100;
}

// Write two overloaded methods with the same name.

// Write a recursive method to find factorial of a number.

// Explain why main() can’t directly call a non-static method.
    
}
