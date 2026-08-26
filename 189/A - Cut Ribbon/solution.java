import java.util.*;
 
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int answer = 0;
        
        for ( int i = 0; i <= n/a; i++){
            
            for ( int j = 0; j <= n/b; j++){
                
                int remaining = n - (i * a + j * b);
                
                if ( remaining < 0){
                    continue;
                }
                
                if ( remaining % c == 0){
                    int k = remaining / c;
                    
                    answer = Math.max(answer, i+j+k);
                }
            }
        }
        
        System.out.println(answer);
        
    }
    
}