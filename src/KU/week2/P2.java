package KU.week2;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n;

        System.out.print("Enter a floating Number : ");
        n = scanner.nextFloat();

        int nInt = (int) n;

        System.out.println("Your number has been converted to int as : "+ nInt);
    }
}


/*

    Enter a floating Number : 2.55506
    Your number has been converted to int as : 2

    Process finished with exit code 0

 */
