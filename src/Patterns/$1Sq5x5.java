package Patterns;

import java.util.Scanner;

public class $1Sq5x5 {

    public static void main(String[] args) {
        int i,j, row;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        for(i=1;i<=row;i++)
        {
         for (j=1;j<=row;j++)
         {
             System.out.print("* ");
         }
            System.out.println("");
        }
    }
}
