import java.util.Scanner;

public class string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        String lsname=name.toLowerCase();
        System.out.println(lsname);
        String Upname=name.toUpperCase();
        System.out.println(Upname);
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 4));

    }
    
}
