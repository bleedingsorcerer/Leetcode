class Solution {
    public int singleNumber(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            int cnt = 0;;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] == key){
                cnt++;
            }
        }
        if(cnt==1){
            return key;
        }
    }    
        return -1;
    }
}