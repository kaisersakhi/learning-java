package CTypePrograms;

/*
 * Author : Kaiser Sakhi
 * Date : 8-Jan-22
 * Environment : Windows10, JB Idea
 * */

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <=20 ;++i)
            if (PrimeNumber.isPrime(i))
                System.out.println(i);
    }
    public static boolean isPrime(int n){
        for (int i = 2 ; i <= n/2 ; ++i)
            if (n % i == 0) return false;
        return true;
    }
}
