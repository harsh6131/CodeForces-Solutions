import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
 
            int answer = n / 4 + (n % 4) / 2;
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}