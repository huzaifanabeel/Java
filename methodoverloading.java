import java.io.PrintStream;

public class methodoverloading {
    static void foo(){
        System.out.println("Good morning bro!");

    }
    static void foo(int a){
        System.out.println("GOOD MORNING "  +  a  +  " BRO");
    }
    // This cant be possible you have to change the parameter in the given bracket
    // static int foo(int a){
    //     System.out.println("GOOD MORNING "  +  a  +  " BRO");
    // }
    public static void main(String [] args){
        //Method overloading is this 
        foo();
        foo(3);

    }
    
}
