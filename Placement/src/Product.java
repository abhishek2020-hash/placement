import java.util.*;
class Product {
    public static int mul(int a,int b){
        int result=a*b;
        System.out.println(result);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        mul(a,b);
    }
}
