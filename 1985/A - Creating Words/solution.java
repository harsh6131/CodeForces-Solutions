import java.util.*;
 
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            String a = sc.next();
            String b = sc.next();
            
            char temp = a.charAt(0);
            
            a = b.charAt(0) + a.substring(1);
            b = temp + b.substring(1);
            
            System.out.println( a + " " + b);
        }
    }
}