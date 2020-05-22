package com;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String str = "dog cat cat dog", pattern = "abba";
        String str1 = "dog cat cat fish", pattern1 = "abba";
        String str2 = "dog cat cat dog", pattern2 = "aaaa";
        String str3 = "dog dpg dog dog", pattern3 = "abba";
        String str4 = "aa aa aa aa", pattern4 = "aaa";
        System.out.println(wordPattern(pattern, str));
        System.out.println(wordPattern(pattern1, str1));
        System.out.println(wordPattern(pattern2, str2));
        System.out.println(wordPattern(pattern3, str3));
        System.out.println(wordPattern(pattern4, str4));
    }
    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String > mapp = new HashMap<>();
        String[] strArr = str.split(" ");
        if(pattern.length() != strArr.length){
            return false;
        }
        display(strArr);
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = strArr[i];
            if(mapp.containsKey(key)){
                String temp = mapp.get(key);
                if(!temp.equals(value)){
                    return false;
                }
            }else{
                if(mapp.containsValue(value)){
                    return false;
                }
                mapp.put(key, strArr[i]);
            }
        }
        return true;
    }
    public static void display(String[] strArr){
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]+" ");
        }
        System.out.println();
    }
}
