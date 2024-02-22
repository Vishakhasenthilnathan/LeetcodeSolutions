class Solution {
    public int findPeakElement(int[] nums) {
        int beg = 0, n = nums.length-1, end = n;
        if(nums.length==1) return 0;
        while(beg<=end){
            if(nums[0]>nums[1])
                return 0;
            if(nums[n]>nums[n-1])
                return n;

            int mid = (beg + end)/2;
            if(nums[mid]> nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            else if(nums[mid]> nums[mid+1])
                end = mid-1;
            else 
                beg = mid+1;
        }
        return 0;
    }
}