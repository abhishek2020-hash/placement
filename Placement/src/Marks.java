import java.util.*;
class Marks {
    public static void main(String args[]) {
        int button;

        do {
            Scanner sc = new Scanner(System.in);
            int marks = sc.nextInt();

            if (marks <= 100 && marks >= 90) {
                System.out.println("THIS IS GOOD.");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("THIS IS ALSO GOOD.");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("THIS IS GOOD AS WELL.");
            } else {
                System.out.println("INVALID");
            }
           button=sc.nextInt();
        }
        while (button == 1);
     }
}
