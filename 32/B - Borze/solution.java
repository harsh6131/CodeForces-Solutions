import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        StringBuilder answer = new StringBuilder();
 
        int i = 0;
 
        while (i < s.length()) {
 
            if (s.charAt(i) == '.') {
                answer.append('0');
                i++;
            } 
            else if (s.charAt(i) == '-') {
 
                if (s.charAt(i + 1) == '.') {
                    answer.append('1');
                } 
                else {
                    answer.append('2');
                }
 
                i += 2;
            }
        }
 
        System.out.println(answer);
    }
}