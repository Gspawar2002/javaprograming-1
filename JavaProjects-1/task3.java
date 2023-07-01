//Create a named loop

import java.util.*;

public class task3 {

    public static void main (String args[]){
        int i,j;

        outer:
        for(i=1;i<=5;i++){
            System.out.println();
        } inner:
        for(j=1;j<=10;j++){
            System.out.print(j + " ");
            if(j==9)
                break inner;
        }

    }
}