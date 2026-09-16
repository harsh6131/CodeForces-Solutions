import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            boolean odd = false;
            boolean even = false;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
 
                if (x % 2 == 0)
                    even = true;
                else
                    odd = true;
            }
 
            if (odd && (even || n % 2 == 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}