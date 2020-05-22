package com.deleteLinkListNode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aa", "ab"));
        //System.out.println(isIsomorphic("add", "goo"));
        //System.out.println(isIsomorphic("paper", "title"));
        //System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return true;
        }
        Map<Character, Character> mapp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);
            if(mapp.containsKey(charFromS)){
                char temp = mapp.get(charFromS);
                if(temp != charFromT){
                    return false;
                }

            }else {
                if(mapp.containsValue(charFromT)){
                    return false;
                }
                mapp.put(charFromS, charFromT);
            }
        }

        return true;
    }

}

