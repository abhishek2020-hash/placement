import java.util.*;
class Check {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum1=0;
        int sum2=0;
        int sum3=0;

for(int i=1;i<=n;i++) {

    int a = sc.nextInt();

    if (a > 0) {
        sum1 = sum1 + 1;
    }
    if (a < 0) {
        sum2 = sum2 + 1;
    }
    if (a == 0) {
        sum3 = sum3 + 1;
    }
}
            System.out.println("TOTAL POSSITIVE NUMBERS: " + sum1);
            System.out.println("TOTAL NEGATIVE NUMBERS: " + sum2);
            System.out.println("TOTAL ZEROES: " + sum3);
    }
}

