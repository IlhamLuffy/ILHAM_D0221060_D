import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String pali = "";
        for(int i = A.length()-1; i >= 0;i--){
            pali += A.charAt(i);
        }
        
        if(pali.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
