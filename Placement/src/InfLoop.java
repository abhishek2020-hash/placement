import java.util.Scanner;

class InfLoop {
    public static void infinte(int x) {
        do {
            System.out.println(x);
        }
        while (true);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        infinte(x);
    }
}
