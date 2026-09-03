import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            long n = sc.nextLong();
            int moves = 0;
 
            while (n != 1) {
 
                if (n % 6 == 0) {
                    n = n / 6;
                    moves++;
                }
                else if (n % 3 == 0) {
                    n = n * 2;
                    moves++;
                }
                else {
                    break;
                }
            }
 
            if (n == 1)
                System.out.println(moves);
            else
                System.out.println(-1);
        }
 
        sc.close();
    }
}