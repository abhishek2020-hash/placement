import java.util.*;
class IsEven {
    public static void even(int n){
        int result=n%2;
        if(result==0){
            System.out.println("THE NUMBER IS EVEN.");
        }else{
            System.out.println("THE NUMBER IS ODD.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        even(n);
    }
}
