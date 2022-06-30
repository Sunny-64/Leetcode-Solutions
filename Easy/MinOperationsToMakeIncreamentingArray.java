// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
class MinOperationsToMakeIncreamentingArray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int total = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int temp = nums[i - 1] - nums[i];
                nums[i] = nums[i - 1] + 1;
                total += (temp + 1);
            }
        }
        return total;
    }
}