package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int myInt = in.nextInt();
        double myDb = in.nextDouble();
        //Flush the "\n" at the end of the input
        in.nextLine();
        String myStr = in.nextLine();
        
        System.out.println("String: " + myStr);
        System.out.println("Double: " + myDb);
        System.out.println("Int: " + myInt);
    }
}



