import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            if (a == b) {
                System.out.println(0);
            } 
            else if (b > a) {
                System.out.println((b - a) % 2 == 1 ? 1 : 2);
            } 
            else {
                System.out.println((a - b) % 2 == 0 ? 1 : 2);
            }
        }
    }
}