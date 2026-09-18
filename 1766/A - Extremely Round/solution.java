import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        ArrayList<Integer> round = new ArrayList<>();
 
        for (int place = 1; place <= 100000; place *= 10) {
            for (int digit = 1; digit <= 9; digit++) {
                round.add(digit * place);
            }
        }
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int count = 0;
 
            for (int x : round) {
                if (x <= n)
                    count++;
            }
 
            System.out.println(count);
        }
    }
}