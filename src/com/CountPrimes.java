package com;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        //System.out.println(isPrime(7));
    }

    public static int countPrimes(int n) {
        if(n == 2){
            return 1;
        }
        int count = 1;
        for (int i = 3; i <= n; i++) {
            if(isPrime(i) == true){
                count++;
            }
        }

        return count;
    }
    
    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
