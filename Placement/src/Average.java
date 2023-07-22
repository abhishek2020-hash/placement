import java.util.*;
class Average {
    public static int avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        System.out.println("THE AVERAGE OF 3 NUMBERS IS: "+avg);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg(a,b,c);
    }
}
