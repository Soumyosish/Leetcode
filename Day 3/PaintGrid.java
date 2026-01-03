import java.util.*;
public class PaintGrid {
    public static int numOfWays(int n) {
        if(n==1)    return 12;
        long number=1000000007;
        long a=6,b=6;
        for(int i=2;i<=n;i++){
            long s1=(3*a+2*b)%number;
            long s2=(2*a+2*b)%number;
            a=s1;b=s2;
        }
        return (int)((a+b)%number);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numOfWays(n));
    }
}