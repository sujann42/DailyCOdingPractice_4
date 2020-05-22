package com;

public class CountNSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int n) {
        String value = "1";
        for (int i = 0; i < n - 1; i++) {
            char ch = value.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < value.length(); j++) {
                if(ch != value.charAt(j)){
                    sb.append(count);
                    sb.append(ch);
                    count = 0;
                    ch = value.charAt(j);
                }
                count++;
            }
            sb.append(count);
            sb.append(ch);
            value = sb.toString();
        }

        return value;
    }
}
