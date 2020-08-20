package pl.andrzejkarwoski;

public class BitCounting {

    /* Write a function that takes an integer as input,
    and returns the number of bits that are equal to one in the binary representation of that number.
    You can guarantee that input is non-negative. */
    public static int countBits(int n){
        int count = 0;
        for(char c : Integer.toBinaryString(n).toCharArray()) if(c == '1') count++;
        return count;
    }

    public static void main(String[] args){
        System.out.println(countBits(1234));
        System.out.println(countBits(6221));
        System.out.println(countBits(12534));
        System.out.println(countBits(1211434));

    }
}
