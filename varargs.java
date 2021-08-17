public class varargs {
    static int sum(int ...ar){
        int result=0;
        for(int a:ar){
            result +=a;
        }
        return result;
    }
    public static void main(String []args){
        System.out.println("The sum of the number is " + sum (4,5,6));
    }
    
}
