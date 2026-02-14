package Prob03;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution{
    
    public static List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
        int aliceScore = 0;
        int bobScore = 0;
        
        for(int i=0;i<3;i++){
           int aVal = a.get(i);
           int bVal = b.get(i);
           
           if(aVal > bVal){
            aliceScore++;
           } else if(aVal < bVal){
            bobScore++;
           } 
        }
        return Arrays.asList(aliceScore,bobScore);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading Alice's triplet
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Reading Bob's triplet
        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        // Printing the result separated by a space
        System.out.println(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
        );

        bufferedReader.close();
    }
}
