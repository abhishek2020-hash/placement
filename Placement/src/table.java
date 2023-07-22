import java.util.*;
class Table {
    public static void main(String args[]){
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" * "+i+" = "+mul);}
    }
}
