package src.main.java.hackerrank;

import java.util.Locale;

public class JavaAnagrams {
    public static  int findingAnagrams(String s1, String s2) {
        int c[] = new int[26];
        int t = s1.length();
        int g = s2.length();
        for (int i = 0; i < s1.length(); i++) {
            c[s1.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s2.length(); j++) {
            c[s2.charAt(j) - 'a']--;
        }
        int total = 0;
        for (int i : c) {
            total += Math.abs(i);
        }
        return total;

    }

    public static void main(String[] args) {
       int ans = findingAnagrams("leena","reena");
        System.out.println(ans);
    }
}
