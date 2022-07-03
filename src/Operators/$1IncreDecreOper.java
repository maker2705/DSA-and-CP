package Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class $1IncreDecreOper {
    /*
        i++(post increment)
        ++i(pre increment)
        i--(post decrement)
        --i(pre decrement )
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int [] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
