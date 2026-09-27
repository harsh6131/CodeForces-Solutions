import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String s = sc.next();
 
            int[] count = new int[7];
 
            for (char ch : s.toCharArray()) {
                count[ch - 'A']++;
            }
 
            int answer = 0;
 
            for (int i = 0; i < 7; i++) {
 
                if (count[i] < m) {
                    answer += m - count[i];
                }
            }
 
            System.out.println(answer);
        }
    }
}