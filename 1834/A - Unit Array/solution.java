import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int negative = 0;
 
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == -1) {
                    negative++;
                }
            }
 
            int ans = 0;
            
            if (negative % 2 == 1) {
                negative--;
                ans++;
            }
            while (negative > n / 2) {
                negative -= 2;
                ans += 2;
            }
 
            System.out.println(ans);
        }
    }
}