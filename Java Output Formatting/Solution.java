package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        System.out.printf("================================\n");
        for(int i = 0; i < 3; i++) {
            String myStr = in.next();
            int myInt = in.nextInt();
            System.out.printf("%-15s%03d\n", myStr, myInt);
        }
        System.out.printf("================================\n");
    }
}




