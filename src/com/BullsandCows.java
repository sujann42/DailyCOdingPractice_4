package com;

import java.util.HashMap;
import java.util.Map;

public class BullsandCows {
    public static void main(String[] args) {
        String secret = "0111";
        String guess  = "7810";
        System.out.println(getHint(secret, guess));
    }
    public static String getHint(String secret, String guess) {
        Map<Character, Integer> secretMap = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            if (secretMap.containsKey(guess.charAt(i))) {
                int temp = secretMap.get(guess.charAt(i));
                secretMap.put(guess.charAt(i), temp + 1);
            } else {
                secretMap.put(secret.charAt(i), 1);
            }
        }
        System.out.println(secretMap);
        System.out.println("_______");
        int bullsCount = 0;
        int cowsCount = 0;
        String result = "";
        for (int i = 0; i < guess.length(); i++) {

            if (guess.charAt(i) == secret.charAt(i)) {
                bullsCount++;
                int temp = secretMap.get(guess.charAt(i));
                secretMap.put(guess.charAt(i), temp - 1);
            }
            System.out.println(secretMap);
            if (secretMap.containsKey(guess.charAt(i))) {
                if (secretMap.get(guess.charAt(i)) >= 1) {
                    cowsCount++;
                    int temp = secretMap.get(guess.charAt(i));
                    secretMap.put(guess.charAt(i), temp - 1);
                }
            }
        }
        result += bullsCount + "A" + cowsCount + "B";
        return result;

    }

}
