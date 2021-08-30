public class recusrsion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[]args){
        int x=4;
        System.out.println("The valve of factorial n is " +factorial(x));

    }
    
}
