package Operators;

import java.util.Scanner;

public class $2BitWiseOp {
 /*   Four bitwise operators
    1. &(And)
    2. |(or)
    3. ~(Not)
    4. ^(Xor)
 */

 public static void main(String[] args) {
     int a,b;
     Scanner sc=new Scanner(System.in);
     a= sc.nextInt();
     b= sc.nextInt();
     System.out.println("a= "+ a);
     System.out.println("b= "+ b);
     int and = a&b;
     System.out.println("Bitwise & of a and b= "+ and);
     int or=a|b;
     System.out.println("Bitwise or of a and b= "+or);
     int not_a=~a;
     int not_b=~b;
     int xor=a^b;
     System.out.println("Bitwise not of a = "+ not_a);
     System.out.println("Bitwise not of b = "+ not_b);
     System.out.println("Bitwise XOR of a and b= "+ xor);

 }
}
