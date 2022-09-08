package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else 
            System.out.println("No");
        String newA = A.substring(0,1).toUpperCase();
        newA += A.substring(1,A.length());
        String newB = B.substring(0,1).toUpperCase();
        newB += B.substring(1,B.length());
        System.out.println(newA + " " + newB);        
    }
}