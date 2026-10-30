import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
    int t = sc.nextInt();
 
    while (t-- > 0) {
        int n = sc.nextInt();
        int p = 1;
 
        while (p * 2 <= n) {
            p *= 2;
        }
 
        System.out.println(p - 1);
    }
 
    sc.close();
}
 
}