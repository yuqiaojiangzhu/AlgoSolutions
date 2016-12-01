/*
Given two non-negative numbers num1 and num2 represented as string, return the 
sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to 
integer directly.
 */
public class AddString {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carrier = 0;
        String result = "";
        while (i >= 0 || j >= 0 || carrier > 0) {
            int value1 = i >= 0 ? (num1.charAt(i--) - '0') : 0;
            int value2 = j >= 0 ? (num2.charAt(j--) - '0') : 0;
            result = (value1 + value2 + carrier) % 10 + result;
            carrier = (value1 + value2 + carrier) / 10;
        }
        return result;
    }

}