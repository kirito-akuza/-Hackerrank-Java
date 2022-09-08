package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String myStr = in.nextLine();
        int j = 0;
        boolean palindrome = true;
        
        for(int i = myStr.length() - 1; i >= 0; i--) {
            if(myStr.charAt(j) != myStr.charAt(i))
                palindrome = false;
            j++;   
        }
        if(palindrome)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}
