package test;

import java.util.ArrayList;
import java.util.List;

public class H438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] need = new int[26];
        for (int i = 0; i < p.length(); i++) {
            need[p.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = 0;
        int[] window = new int[26];
        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;

            while (window[s.charAt(right) - 'a'] > need[s.charAt(right) - 'a']) {
                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
            if (right - left == p.length()) {
                res.add(left);
            }
        }
        return res;
    }
}
