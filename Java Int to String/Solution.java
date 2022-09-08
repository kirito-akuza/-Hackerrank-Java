package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = String.valueOf(n);
        if(s.isEmpty())
            System.out.println("Wrong answer");
        else
            System.out.println("Good job");
    }
}