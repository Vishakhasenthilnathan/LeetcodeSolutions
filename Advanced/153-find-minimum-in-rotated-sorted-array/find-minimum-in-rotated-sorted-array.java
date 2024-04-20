class Solution {
    public int findMin(int[] nums) {
        int beg = 0;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[beg]<=nums[end]){
                min = Math.min(min,nums[beg]);
                break;
            }
            if(nums[beg] <= nums[mid]){
                min = Math.min(min,nums[beg]);
                beg = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                end = mid-1;
            }
        }
        return min;
    }
}