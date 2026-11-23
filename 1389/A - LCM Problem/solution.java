import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
 
            if (2 * l <= r) {
                System.out.println(l + " " + (2 * l));
            } else {
                System.out.println("-1 -1");
            }
        }
 
        sc.close();
    }
}