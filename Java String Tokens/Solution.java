package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        String myStr = in.nextLine().trim();
        
        if(myStr.length() == 0) 
            System.out.println(myStr.length());
        else {
            String[] myStrArr = myStr.trim().split("[!,?.*_'@\\ ]+");
        
            System.out.println(myStrArr.length);
            for(int i = 0; i < myStrArr.length; i++) {
                System.out.println(myStrArr[i]);
            }
        }
    }
}

