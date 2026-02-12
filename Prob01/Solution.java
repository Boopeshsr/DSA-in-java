import java.util.*;

public class Solution{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }
       
       int i =0;
       int j = arr.length-1;
       int temp;
       
       while(i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
        i++;
        j--;
       }
       
       for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
            if (k < arr.length - 1) {
                System.out.print(" ");
            }
        }
       
        sc.close();
    }
}