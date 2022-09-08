package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        String[] arr = new String[s.length() - n + 1];

        for(int i = 0; i <= s.length() - n; i++) {
            arr[i] = s.substring(i,i+n);
        }
        
        String min = arr[0];
        String max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max.compareTo(arr[i]) < 0)
                max = arr[i];
            if(min.compareTo(arr[i]) > 0)
                min = arr[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}