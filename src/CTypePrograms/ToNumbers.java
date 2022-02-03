package CTypePrograms;
/*
 * Author : Kaiser Sakhi
 * Date : 03-Feb-22
 * Environment : Windows10, JB Idea
 * */

/*
*   1. Display Digits
*   2. Count digits of a number
*   3. Check a number for armstrong
*   4. Reverse a number
*   5. Check for palindrome
* */



public class ToNumbers {
    public static void main(String[] args) {
        int armstrongNum = 153;
        ToNumbers.displayDigits(132);
        ToNumbers.countDigits(45678);
        System.out.println("Its " + ToNumbers.isArmStrong(armstrongNum) + " that "+armstrongNum+" is Armstrong!");
        System.out.println(armstrongNum +", its reverse is "+ ToNumbers.reverseNumber(armstrongNum));
        System.out.println("Its " + ToNumbers.isPalindrome(12321) + " that 12321 is palindrome!");
    }
    public static String numToString(int num, boolean shouldBeReversed){
        String string = "";
        while (num > 0){
            if (shouldBeReversed)
                string += String.valueOf(num % 10);
            else
                string = num % 10 + string;
            num /= 10;
        }
        return  string;
    }

    public static void displayDigits(int n){
//        Integer.parseInt(numToString(n));
        String num = ToNumbers.numToString(n, false);
        for (int i = 0; i < num.length(); ++i){
            System.out.println(num.charAt(i));
        }
    }

    public static void countDigits(int n){
        System.out.println("The number has " + ToNumbers.numToString(n, false).length() + " digits.");
    }

    public static boolean isArmStrong(int n){
        String num = ToNumbers.numToString(n, false);
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < num.length(); ++i){
            digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            sum += (digit * digit * digit);
        }

        return  (n == sum);
    }

    public static int reverseNumber(int n){
        return Integer.parseInt(String.valueOf(ToNumbers.numToString(n, true)));
    }

    public static boolean isPalindrome(int n){
        String string = ToNumbers.numToString(n, false); // i could also call toString again and directly compare the 2, but for now i will stick ot logic!

        int j = string.length() - 1;
        for (int i = 0; i < (j + 1)/2; ++i){
            if (!String.valueOf(string.charAt(i)).equals(String.valueOf(string.charAt(j)))){
                return false;
            }
            --j;
        }
        return true;
    }

 // and , its end!

}
