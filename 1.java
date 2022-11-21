import java.util.*;

public class 1 {
    public static long dectothree(int n)
    {
       long rem=0,fact=1;
       while(n>0) 
       {
        rem+=n%3*fact;
        n/=3;
        fact*=10;

       }

       return rem;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(dectothree(n));
    }
    
}
