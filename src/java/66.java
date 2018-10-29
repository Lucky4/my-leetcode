public class Solution {
    public int[] plusOne(int[] digits) {
        boolean needAdd = true;
        
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            if (digits[i] < 10) {
                needAdd = false;
                break;
            }
            digits[i] = 0;
        }

        if (needAdd) {
            int[] newDigits= new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }
}