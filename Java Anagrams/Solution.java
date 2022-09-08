package HackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        boolean anagram = true;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a_arr = new char[a.length()];
        char[] b_arr = new char[b.length()];
        
        int count = a.length();
        
        if(a.length() != b.length())
            anagram = false;
        else {
            for(int i = 0; i < a.length(); i++) {
                a_arr[i] = a.charAt(i);
                b_arr[i] = b.charAt(i);
            }
            for(int i = 0; i < a.length(); i++) {
                for(int j = 0; j < a.length(); j++) {
                    if(a_arr[i] == b_arr[j]) {
                        a_arr[i] = '*';
                        b_arr[j] = '*';
                        count--;
                        break;
                    }
                }
            }
            if(count != 0) 
                anagram = false;
        }
        

        if(anagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
