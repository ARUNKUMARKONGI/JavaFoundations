package _1nextsession;

import java.util.Scanner;

public class HourGlassNumberPattern {
        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int rows = sc.nextInt();
            int i, j, k;

            for (i = 1; i <= rows; i++) {
                for (k = 1; k < i; k++)
                {
                    System.out.print(" ");
                }
                for (j = i; j <= rows; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (i = rows - 1; i >= 1; i--)
            {
                for (k = 1; k < i; k++)
                    System.out.print(" ");

                for (j = i; j <= rows; j++)
                    System.out.print(j + " ");

                System.out.println();
            }
        }
    }