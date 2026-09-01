import java.util.*;
 
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int n = sc.nextInt();
            String s = sc.next();
            
            char[] input = s.toCharArray();
            char[] target = "Timur".toCharArray();
            
            Arrays.sort(input);
            Arrays.sort(target);
            
            if (n == 5 && Arrays.equals(input, target)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}