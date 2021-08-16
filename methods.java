public class methods {
    //static int logic(int x,int y){
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;


        }
        else{
            z=(x+y)*5;
        }
        return z;

    }
    public static void main(String []args){
        int a=5;
        int b=8;
        int c;
        if(a>b){
            c=a+b;


        }
        else{
            c=(a+b)*5;
        }
        int a1=115;
        int b1=20;
        int c1;
        if(a1>b1){
            c1=(a+b);

        }
        else{
            c1=(a1+b1)*5;

        }
        methods obj=new methods();
        c=obj.logic(a,b);
        c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
    
}
