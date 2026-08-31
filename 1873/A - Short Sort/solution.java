import java.util.*;
 
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        
        int t = sc.nextInt();
        String target = "abc";
        
        while(t-- > 0){
            
            String s = sc.next();
            
            int count = 0;
            
            for (int i = 0; i < 3 ; i++){
                if(s.charAt(i) != target.charAt(i)){
                    count++;
                }
            }
            
            if(count <= 2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
        
    }
}