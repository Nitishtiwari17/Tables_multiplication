package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int j,n;
        System.out.println("Input the number(Table to be calculated):");
        {
            System.out.println("Intput number of term:");
            Scanner in=new Scanner(System.in);
            n=in.nextInt();

            System.out.println("\n");
            for(j=0;j<=n;j++)

                System.out.println(n+" X "+j+"="+n*j);
        }
	// write your code here
    }
}
