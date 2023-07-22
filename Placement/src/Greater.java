import java.util.*;
class Greater {
    public static void compare(int a,int b){
        if(a>b){
            System.out.println(a+" IS GREATER.");
        }else{
            System.out.println(b+" IS GREATER.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        compare(a,b);
    }
}
