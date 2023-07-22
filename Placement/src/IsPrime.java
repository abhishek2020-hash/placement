import java.util.*;
public class IsPrime {
    public static int isPrime(int n) {

        for (int i = 2; i < n; i++) {
            int num = n % i;
        if (num != 0) {
                System.out.println("THE NUMBER IS PRIME.");
                break;
            } else {
                System.out.println("THE NUMBER IS NOT PRIME.");
                break;
            }}
    return 0;}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        isPrime(n);
    }
}
