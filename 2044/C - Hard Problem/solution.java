import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            long row1 = Math.min(a, m);
            long row2 = Math.min(b, m);
 
            long empty = (m - row1) + (m - row2);
 
            long flexible = Math.min(c, empty);
 
            long answer = row1 + row2 + flexible;
 
            System.out.println(answer);
        }
    }
}