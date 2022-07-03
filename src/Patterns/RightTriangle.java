package Patterns;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        int n,i;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for (i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println();
    }
}
