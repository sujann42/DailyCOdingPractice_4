package com;

public class LongSubStrWithoutRepChars {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        String subStr = "";
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            subStr += s.charAt(i);
            count++;
            for (int j = i + 1; j < s.length(); j++) {

                if (subStr.indexOf(s.charAt(j)) >= 0) {
                    break;
                } else {

                    subStr += s.charAt(j);
                    count++;

                }
            }
            maxLen = Math.max(maxLen, count);
            count = 0;
            subStr = "";
        }

        return maxLen;
    }


    public static void main(String[] args) {
        String strEmp = "dvdf";//"dvdf"
        System.out.println("Max Substr len:  " + lengthOfLongestSubstring(strEmp));

        /*String strEmp = "";
        System.out.println(lengthOfLongestSubstring(strEmp)+" == 0");
        String str = "abbadad";
        System.out.println(lengthOfLongestSubstring(str)+" == 3");
        String str2 = "abcdabcbb";
        System.out.println(lengthOfLongestSubstring(str2)+" == 4");
        String str3 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(str3)+" == 1");
        String str4 = "pomawingskew";
        System.out.println(lengthOfLongestSubstring(str4)+" == 5");
        System.out.println("ab".indexOf('a'));*/
    }
}
