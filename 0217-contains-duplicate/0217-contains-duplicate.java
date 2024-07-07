class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
        
        // Check for consecutive duplicates in the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
}
}