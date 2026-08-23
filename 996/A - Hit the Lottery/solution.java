import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int count = 0;
 
        int[] bills = {100, 20, 10, 5, 1};
 
        for (int bill : bills) {
            count += n / bill;
            n %= bill;
        }
 
        System.out.println(count);
    }
}