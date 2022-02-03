package CTypePrograms;

/*
 * Author : Kaiser Sakhi
 * Date : 8-Jan-22
 * Environment : Windows10, JB Idea
 * */

public class BitWiseOps {
    public static void main(String[] args) {
        System.out.println(isEven(27));
        System.out.println(BitWiseOps.toBinary(2700, 4));
        System.out.println(BitWiseOps.fromBinaryToInt(BitWiseOps.toBinary(6, 4)));
        BitWiseOps.swap();
        System.out.println("Reversed of 10  :" + BitWiseOps.toBinary(BitWiseOps.reverseAllBits((byte) 10), 1));
        System.out.println("Inverting bit of 10 : " + BitWiseOps.toBinary(BitWiseOps.invertAllBits((byte) 10), 1));
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    static String toBinary(int n, int sizeBytes) {
        String binary = "";
        for (int i = (sizeBytes * 8 - 1); i > -1; --i) {

            if (((1 << i) & n) == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
        }
        return binary;
    }

    //    TO DO :
    static byte reverseAllBits(byte n) {

        int i = 0;
        int j = 7;
        boolean isI0;
        boolean isJ0;

        while (j >= i) {

            isJ0 = ((1 << j) & n) == 0; // get the bit at j
            isI0 = ((1 << i) & n) == 0; // get the bit at i

            // if jth bit is 0, then AND it on ith position,
            // by first shifting the 1 iX , and inverting all bits
            if (isJ0) n &= BitWiseOps.invertAllBits((byte) (1 << i));
            else  n |= (1 << i); // else shift the 1 iX and OR it

            // same with jth position
            if (isI0) n &= BitWiseOps.invertAllBits((byte) (1 << j));
            else n |= (1 << j);

            ++i;
            --j;

        }

        return n;
    }

    static int fromBinaryToInt(String binary) {
        int n = 0;
        String s;
        int j = 0;
        for (int i = 31; i > -1; --i) {
//            s = ;
            n += Integer.parseInt(String.valueOf(binary.charAt(i))) << j++;
        }
        return n;
    }

    static void swap() {
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A : " + a + " | B : " + b);
    }

    static byte invertAllBits(byte n) {
        byte m = 0;
        boolean isZero;
        for (byte i = 8; --i > -1; ) {
            isZero = ((1 << i) & n) == 0;
            m |= ((isZero) ? 1 : 0) << i;
        }
        return m;
//        System.out.;
    }

}
