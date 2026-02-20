package Prob07;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Outer loop for each row (from 1 to n)
        for (int i = 1; i <= n; i++) {
            
            // Inner loop 1: Print (n - i) spaces for right-alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop 2: Print i '#' symbols
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            
            // Move to the next line after completing the row
            System.out.println();
        }
    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
