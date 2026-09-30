import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long n = sc.nextLong();
 
            long total = a + b + c + n;
 
            if (total % 3 == 0 && Math.max(a, Math.max(b, c)) <= total / 3)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}