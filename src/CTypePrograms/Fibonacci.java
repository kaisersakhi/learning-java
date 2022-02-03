package CTypePrograms;
/*
 * Author : Kaiser Sakhi
 * Date : 8-Jan-22
 * Environment : Windows10, JB Idea
 * */

public class Fibonacci {
    public static void main(String[] args) {

        int current;
        int previous1 = 1;
        int previous2 = 1;
        int numberOfTerms  = 10;

        for (int i  = 0 ; i <= numberOfTerms ; ++i){
            System.out.println(previous1);
            current = previous1 + previous2;
            previous1 = previous2;
            previous2 = current;
        }
    }
}
