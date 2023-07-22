import java.util.*;
class Calc {
    public static int calculator(int a,int b,int c){

        switch(c){
            case 1 : int add= a+b;
            System.out.println("ADDITION = "+add);
            break;
            case 2 : int sub= a-b;
            System.out.println("SUBSTRACTION = "+sub);
            break;
            case 3 : int mul= a*b;
            System.out.println("MULTIPLICATION = "+mul);
            break;
            case 4 : int div= a/b;
            System.out.println("DIVISION = "+div);
            break;
            case 5 : int rem= a%b;
            System.out.println("REMAINDER = "+rem);
            break;
            default:System.out.println("INVALID CHOICE");


        }
    return 0;
    }
    public static void main(String[] args){
        System.out.println("ENTER 2 NUMBERS AND YOUR CHOICE : ");
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       calculator(a,b,c);


    }

}
