class Solution {
    public int findMin(int[] nums) {
        int beg = 0;
        int end = nums.length-1;
        int min = 0;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[beg] <= nums[mid] && nums[beg] <= nums[end]){
                if(nums[mid]<nums[beg]){
                    min = nums[mid];
                }
                else{
                    min = nums[beg];
                }
                end = mid-1;
            }
            else{
                if(nums[mid]<nums[end]){
                    min = nums[mid];
                    end = mid;
                }
                else{
                    min = nums[end];
                    beg = mid+1;
                }
            }
        }
        return min;
    }
}