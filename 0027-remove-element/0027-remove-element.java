class Solution {
    public int removeElement(int[] nums, int val) {
        int reader=0, writer =0;
        while(reader < nums.length){
            if(nums[reader]==val){
                reader++;
            }
            else{
                nums[writer++] = nums[reader++];
            }       
        }
        return writer;
    }
}