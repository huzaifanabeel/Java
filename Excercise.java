//Author:Huzaifa Nabeel
import java.util.Scanner;
public class Excercise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Marks");
        int marks=sc.nextInt();
        System.out.println("Enter the Second Marks");
        int marks1=sc.nextInt();
        System.out.println("Enter the third Marks");
        int marks2=sc.nextInt();
        System.out.println("Enter the fourth Marks");
        int marks3=sc.nextInt();
        System.out.println("Enter the fifth Marks");
        int marks4=sc.nextInt();
        
        int total=(marks+marks1+marks2+marks3+marks4);
        int total_marks=500;
        float percentage=(total*100)/total_marks;
        System.out.println("The percetage is");
        System.out.println(percentage);


    }
    
}
