import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            String s = sc.next();
 
            char max = 'a';
 
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) > max) {
                    max = s.charAt(i);
                }
            }
 
            int answer = max - 'a' + 1;
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}