/*
 * Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter 
at a random position.

Find the letter that was added in t.

Example:

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char result = 0;
        for (int i = 0; i < t.length(); ++i) {
            if (i < s.length()) {
                result ^= s.charAt(i);
            }
            result ^= t.charAt(i);
        }
        return result;
    }

/*****************************************************************************/

    public char findTheDifference(String s, String t) {
        int[] hash = new int[256];
        for (int i = 0; i < t.length(); ++i) {
            if (i < s.length()) {
                hash[s.charAt(i)]++;
            }
            hash[t.charAt(i)]--;
        }
        char result = 0;
        for (int i = 0; i < hash.length; ++i) {
            if (hash[i] < 0) {
                result = (char) i;
            }
        }
        return result;
    }

}
