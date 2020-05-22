package com;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        Map<Character, Integer> secretMap = new HashMap<>();
        Map<Character, Integer> aa = new HashMap<>();
        aa.put('0', 1);
        System.out.println(aa);
        for (int i = 0; i < secret.length(); i++) {
            if(secretMap.containsKey(secret.charAt(i))){
                int temp = secretMap.get(guess.charAt(i));
                secretMap.put(guess.charAt(i), temp+1);
            }else {
                secretMap.put(secret.charAt(i), 1);
            }
        }
        System.out.println(secretMap);
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                secretMap.remove(guess.charAt(i));
            }
        }

    }
}
