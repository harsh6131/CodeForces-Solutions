import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        int option1 = n * a;
 
        int option2 = (n / m) * b + (n % m) * a;
 
        int option3 = ((n + m - 1) / m) * b;
 
        int answer = Math.min(option1, Math.min(option2, option3));
 
        System.out.println(answer);
    }
}