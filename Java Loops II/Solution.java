package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
  
        for(int i = 0; i < q; i++) {
            int sum = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++) {
                sum += b * Math.pow(2,j);
                System.out.printf("%d ", sum);
            }
            System.out.println();
        }
    }
}

