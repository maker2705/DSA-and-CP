package Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class $5Sum2Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int [] a1= new int[n];
        int [] a2=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]= sc.nextInt();
        }
        for(int i=0;i<a1.length;i++){
            a2[i]= sc.nextInt();
        }
        int [] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=a1[i]+a2[i];
           /* for (int j=0;j<n;j++){

            }*/

        }

        System.out.println(Arrays.toString(result));
    }
}
