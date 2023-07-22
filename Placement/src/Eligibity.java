import java.util.*;
class Eligibity{
    public static void check(int a){
        if(a>18){
            System.out.println("ELIGIBLE TO VOTE.");
        }else{
            System.out.println("NOT ELIGIBLE TO VOTE.");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        check(a);
    }
}
