package pl.andrzejkarwoski;

public class PrimeNumber {

    /*
    Define a function that takes an integer argument and returns logical value true or false depending on if the integer is a prime.

    Per Wikipedia, a prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     */

    // http://www.algorytm.edu.pl/algorytmy-maturalne/badanie-czy-liczba-pierwsza.html

    public static boolean isPrime(int num) {
        if(num<2) return false;
        for (int i = 2; i*i <= num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args ){
        System.out.println(isPrime(820));
        System.out.println(isPrime(1));
        System.out.println(isPrime(0));
        System.out.println(isPrime(4));
        System.out.println(isPrime(7));
    }


}
