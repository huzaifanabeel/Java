import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=56){
            System.out.println("You are experienced");
        
        }
        else if(age>=46){
            System.out.println("You are semi-expeireinced");
        }
        else if(age>=36){
            System.out.println("You are just being experienced");

        }
        else{
            System.out.println("You are not experienced");
        }
    }
    
}
