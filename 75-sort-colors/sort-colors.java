class Solution {
    public void sortColors(int[] nums) {
        //Dutch flag algorithm
        int low=0,mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swapNumbers(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swapNumbers(nums,mid,high);
                high--;
            }
        }
    }
    public void swapNumbers(int[] nums, int midIndex, int indexToBeSwapped){
        int temp = nums[midIndex];
        nums[midIndex] = nums[indexToBeSwapped];
        nums[indexToBeSwapped] = temp;
    }
}