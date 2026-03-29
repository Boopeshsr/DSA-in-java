import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0; 
        // Iterate through the list and add each value to the sum
        for (Long number : ar) {
            sum += number;
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // FIX: Changed System.getenv("OUTPUT_PATH") to System.out to avoid NullPointerException
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the number of elements
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the space-separated longs and collect them into a List
        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long result = Result.aVeryBigSum(ar);

        // Write the result to the console
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}