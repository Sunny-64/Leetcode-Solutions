// https://leetcode.com/problems/plus-one/

public class PlusOne {
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
