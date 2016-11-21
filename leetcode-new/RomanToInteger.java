/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; --i) {
            if (map.get(s.charAt(i + 1)) >= map.get(s.charAt(i))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

}
