package Array;

import java.util.*;
public class $2MaxMinArrrElement {

    static void getMinMax(long[] arr){
        long max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(max+" "+min);
        System.out.println("Span of the array is: " + (max-min));
    }

    public static void main(String[] args) {

        long[] arr= new long[7];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();

        }
        $2MaxMinArrrElement.getMinMax(arr);

        }
    }


