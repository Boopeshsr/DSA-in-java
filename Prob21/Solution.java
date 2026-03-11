    package Prob21;
    import java.io.*;
    import java.util.*;
    import java.util.stream.*;
    import static java.util.stream.Collectors.toList;

    class Result {


        public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[6];

            for (int bird : arr) {
                count[bird]++;
            }

            int max = 0;
            int id = 0;

            for (int i = 1; i <= 5; i++) {
                if (count[i] > max) {
                    max = count[i];
                    id = i;
                }
            }

            return id;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

            int result = Result.migratoryBirds(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
