package Operators;

import java.util.Scanner;

public class $3ShiftOperators {

    public static void main(String[] args) {
        int n,shift;
        Scanner sc=new Scanner(System.in);

        /*
        1. LeftShift(<<)
        */
        System.out.println("Enter a number for left and right shift: ");
        n= sc.nextInt();
        System.out.println("Enter the shift count: ");
        shift= sc.nextInt();
        int ls;
        int rs;
        ls=n<<shift;
        /*
        2. RightShift(>>)
        */
        rs=n>>shift;
        System.out.println("left shift of the given number is: "+ ls);
        System.out.println("right shift of the given number is " + rs);
        //System.out.printf("right shift of the given number is %.2f: ", rs);

    }



}
