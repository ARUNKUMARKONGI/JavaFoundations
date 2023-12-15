package Arrays;

import java.util.Scanner;

public class SumofArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] values = new int[100];
        int count=0;
        while(sc.hasNextInt() && count<5)
        {
                  values[count]=sc.nextInt();
                  count++;
        }
       // int sum = Arrays.stream(values).sum();
        int sum=0;
        for(int i : values)
        {
            sum=sum+i;
        }
        //enhanced for loop
        //here i represents array values
        System.out.println("sum of int elements in the array is: "+sum);

       /* for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }*/

    }
}
