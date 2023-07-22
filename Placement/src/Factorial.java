import java.util.*;
public class Factorial {
    public static int fact(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result=result*i;}
            System.out.println(result);

        return 0;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    fact(n);
}
}