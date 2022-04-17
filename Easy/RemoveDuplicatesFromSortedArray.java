package Easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        for(int i = 0; i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 101;
            }
        }
//        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 101){
                count++;
            }
        }
        return count;
    }
}
