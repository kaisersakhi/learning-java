package CTypePrograms;
/*
 * Author : Kaiser Sakhi
 * Date : 8-Jan-22
 * Environment : Windows10, JB Idea
 * */

import java.util.Scanner;

/*
* program to find the zeros of a quadratic equation with the help of quadratic formula
*
* */

public class QuadraticZeros {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*************** Zeros of Quadratic Equation *****************");

        int a;
        int b;
        int c;
        double root1;
        double root2;
        
        System.out.println();
        System.out.println("Enter A,B,C -> press return for next : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        root1 = Math.sqrt((b*b - (4*a*c))) ;
        root2 = ((b * -1) - root1) / (2 * a);
        root1 = ((b * -1) + root1) / (2 * a);

        System.out.println("Root 1  :  " + root1 + " | Root 2 : " + root2);
    }
}
