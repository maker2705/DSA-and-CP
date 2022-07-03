package Array;

import java.util.Scanner;

public class $1FindElement {
    static void find(int x)
    {
        int[] arr={47,83,292,1,34,98};
        for (int i=0;i< arr.length;i++){
            if(x==arr[i])
                System.out.println(i);

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to find: ");
        int a=sc.nextInt();
        $1FindElement.find(a);

    }
}
