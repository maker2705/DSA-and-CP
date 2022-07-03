package Array;

import java.util.Scanner;

public class $4BarChart {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();//n for number of bars
            int [] arr= new int[n];
            //taking input...
            for (int i=0;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            //finding bar of max height
            int max=arr[0];
            for(int i=0; i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }

            }
            System.out.println(max);
            //creating bar...

            for(int i=max;i>=1;i--){
                for(int j=0;j< arr.length;j++){
                    if(arr[j]>=i)
                    {
                        System.out.print("*\t");
                    }
                    else
                        System.out.print("\t");
                }
                System.out.println();
            }
        }



        }


    }

