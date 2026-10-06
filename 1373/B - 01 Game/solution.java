import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            int zero = 0, one = 0;
 
            for (char c : s.toCharArray()) {
                if (c == '0') zero++;
                else one++;
            }
 
            if (Math.min(zero, one) % 2 == 1)
                System.out.println("DA");
            else
                System.out.println("NET");
        }
    }
}