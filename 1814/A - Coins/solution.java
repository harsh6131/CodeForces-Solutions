import java.util.*;
 
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if(n % 2 == 0 || k % 2 == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}