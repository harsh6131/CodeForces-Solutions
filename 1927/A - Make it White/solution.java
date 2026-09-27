import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int first = s.indexOf('B');
            int last = s.lastIndexOf('B');
 
            System.out.println(last - first + 1);
        }
    }
}