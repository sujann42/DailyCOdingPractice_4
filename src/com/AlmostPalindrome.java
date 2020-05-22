package com;

public class AlmostPalindrome {
    public static void main(String[] args) {
        //System.out.println(validPalindrome("abaa"));
        System.out.println(isPalindrome("abaa", 0, 4));

    }
    private static boolean isPalindrome(String s, int i, int j) {
        for (; i < j; i++,j--)
            if (s.charAt(i) != s.charAt(j)) return false;

        return true;
    }
    public static boolean validPalindrome(String s) {
            int begin = 0;
            int end = s.length() - 1;

            while (begin < end){
                if(s.charAt(begin) != s.charAt(end)){
                    return delOneChar(s,begin+1,end) || delOneChar(s,begin,end-1);
                }else{
                    begin++;
                    end--;
                }
            }

            return true;
        }

        public static boolean delOneChar(String s, int start, int end){
            while (start < end){
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

}
