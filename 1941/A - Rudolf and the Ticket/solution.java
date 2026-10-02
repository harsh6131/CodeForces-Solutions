import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
 
            int[] b = new int[n];
            int[] c = new int[m];
 
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
 
            for (int i = 0; i < m; i++)
                c[i] = sc.nextInt();
 
            int ans = 0;
 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (b[i] + c[j] <= k)
                        ans++;
                }
            }
 
            System.out.println(ans);
        }
    }
}