import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int l = sc.nextInt();
 
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        Arrays.sort(a);
 
        double ans = 0;
 
        ans = Math.max(ans, a[0]);
        ans = Math.max(ans, l - a[n - 1]);
 
 
        for (int i = 1; i < n; i++) {
            double gap = (a[i] - a[i - 1]) / 2.0;
            ans = Math.max(ans, gap);
        }
 
        System.out.println(ans);
    }
}