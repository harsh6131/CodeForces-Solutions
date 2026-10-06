import java.util.*;
 
public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         while(t-- > 0){
             
             String s = sc.next();
             boolean possible = false;
             
             for (int i = 1; i < s.length(); i++){
                 if(s.charAt(i) == s.charAt(i-1)){
                     possible = true;
                     break;
                 }
             }
             
             System.out.println(possible ? 1 : s.length());
         }
    }
}