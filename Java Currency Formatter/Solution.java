package HackerRank;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        double currency = in.nextDouble();

        NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nF.format(currency);
        
        nF = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = nF.format(currency);
        
        nF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nF.format(currency);
        
        nF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nF.format(currency);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    
}
