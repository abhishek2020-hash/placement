import java.util.*;
public class OddSum {
    public static int sum(int n){
        int result=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                result = result + i;
            }
        }
                System.out.println("THE SUM OF ALL ODD NUMBERS FROM 1 TO "+n+" is "+result);

        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
    }
}
