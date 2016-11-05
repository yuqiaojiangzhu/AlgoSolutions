/*
 * Given a string s and a non-empty string p, find all the start indices of p's 
 * anagrams in s.

 * Strings consists of lowercase English letters only and the length of both 
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1:
 * 
 * Input:
 * s: "cbaebabacd" p: "abc"
 * 
 * Output:
 * [0, 6]
 * 
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * 
 * Input:
 * s: "abab" p: "ab"
 * 
 * Output:
 * [0, 1, 2]
 * 
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        for (int i = 0; i < s.length() - p.length() + 1; ++i) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isAnagram(String s, String p) {
        if (s == null || p == null || s.length() != p.length()) {
            return false;
        }
        int[] count = new int[128];
        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

}
