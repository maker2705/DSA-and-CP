package CodeChefStarters45;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefApps
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int T,S,X,Y,Z;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        int sum,occ,space;
        for (int i=1;i<=T;i++ ){
            S=sc.nextInt();
            X=sc.nextInt();
            Y=sc.nextInt();
            Z=sc.nextInt();
            occ=X+Y;
            int ext ;
            space=S-occ;
            if (Z<=space)
            {
                System.out.println("0");
            }
            else {
                ext= space+X;
                if(Z<=ext)
                    System.out.println("1");
                else{
                    ext=space+Y;
                    if(Z<=ext){
                        System.out.println("1");
                    }
                    else
                    {
                        ext=space+occ;
                        if(Z<=ext)
                        {
                            System.out.println("2");
                        }

                    }
                }
            }



        }
        //int t,mem,x,y,z,A,B;
        //t=sc.nextInt();
               /* while(t-->0)
                {
                    mem=sc.nextInt();
                    x=sc.nextInt();
                    y=sc.nextInt();
                    z=sc.nextInt();
                    int rem=mem-(x+y);
                    if(rem>=z)
                    {
                        System.out.println("0");
                    }
                    else
                    {
                        A=rem+x;
                        if(A>=z)
                        {
                            System.out.println("1");
                        }
                        else
                        {
                            B=rem+y;
                            if(B>=z)
                            {
                                System.out.println("1");
                            }
                            else
                            {
                                int C=x+y+rem;
                                if(C>=z)
                                {
                                    System.out.println("2");
                                }
                            }
                        }

                    }

                }*/



    }
}

