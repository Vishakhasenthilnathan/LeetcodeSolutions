class Solution {
    public int removeDuplicates(int[] nums) {
        int reader = 1; int writer = 1;
        while(reader<nums.length){
            if(nums[reader]== nums[reader-1]){
                reader++;
            }
            else{
                nums[writer++] = nums[reader++];
            }
        }
        return writer;
    }
}