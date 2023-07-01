//Find a non-unique duplicate in an array of integers

import java.util.*;

public class task5 {

    public static void main (String[] args) {
        int [] my_array = {1,2,5,5,6,6,7,2};
        for(int i=0;i<my_array.length+1;i++) {
     for(int j=1;j<my_array.length;j++) {
         if((my_array[i] == my_array[j]) && (i !=j)) {
             System.out.println("Duplicate Element : " + my_array[j]);
         }
     }
     }
        }
    }