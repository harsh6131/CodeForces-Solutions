import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            String s = sc.next();
 
            if (s.startsWith("10") && s.length() > 2) {
                String exponent = s.substring(2);
 
                if (exponent.charAt(0) != '0' &&
                    Integer.parseInt(exponent) >= 2)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}