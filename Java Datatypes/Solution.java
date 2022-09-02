package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        
        for(int i = 0; i < j; i++) {
            try {
                long n = in.nextLong();
                System.out.printf("%d can be fitted in:\n", n);
                if((n <= (Math.pow(2,8)/2)-1) && n >= -(Math.pow(2,8)/2)) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ((n <= Short.MAX_VALUE) && (n >= Short.MIN_VALUE)) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ((n <= Integer.MAX_VALUE) && (n >= Integer.MIN_VALUE)) {
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if ((n <= Long.MAX_VALUE) && (n >= Long.MIN_VALUE)) {
                    System.out.println("* long");
                }
            }
            catch (Exception e) {
                System.out.printf("%s can't be fitted anywhere.\n", in.next());
            }
        }
    }
}