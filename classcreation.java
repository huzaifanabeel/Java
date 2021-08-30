class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("The id of employee is "+id);
        System.out.println("The name of emoloyee is "+name);
    }
}
public class classcreation {

    public static void main(String[]args){
        System.out.println("This is our custom new class");
        Employee me=new Employee();
        Employee huza=new Employee();
        me.id=45;
        me.name="Huzaifa";
        huza.id=89;
        huza.name="Mansoor";
        huza.printdetails();
        // System.out.println(me.id);
        // System.out.println(me.name);



    }
    
}
