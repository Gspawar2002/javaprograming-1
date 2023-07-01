//Find a single duplicate in an array of integers

import java.util.*;

public class task4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [] {1,2,3,4,2,7,8,8,3};
        System.out.println("Duplicate elements in given array");
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}