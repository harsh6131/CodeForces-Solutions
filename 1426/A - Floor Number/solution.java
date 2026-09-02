import java.util.*;
public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int floor = 1;
            int apartment = 2;
            
            while(apartment < n){
                floor++;
                apartment += x;
            }
            
            System.out.println(floor);
        }
    }
}