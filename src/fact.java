
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int factorial =1;

	for(int i=num;i>0;i--)
    {
        factorial = factorial *i;
    }
    System.out.println("Factorial is: " +factorial);
    }
}
