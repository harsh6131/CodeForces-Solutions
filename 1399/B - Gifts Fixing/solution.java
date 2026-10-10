import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long minA = Long.MAX_VALUE, minB = Long.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                minA = Math.min(minA, a[i]);
            }
 
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                minB = Math.min(minB, b[i]);
            }
 
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.max(a[i] - minA, b[i] - minB);
            }
 
            System.out.println(ans);
        }
    }
}