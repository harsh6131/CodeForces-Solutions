import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int w = sc.nextInt();
            int h = sc.nextInt();
            long n = sc.nextLong();
 
            long pieces = 1;
 
            while (w % 2 == 0) {
                w /= 2;
                pieces *= 2;
            }
 
            while (h % 2 == 0) {
                h /= 2;
                pieces *= 2;
            }
 
            if (pieces >= n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}