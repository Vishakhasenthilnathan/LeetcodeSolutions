class Solution {
    public int majorityElement(int[] nums) {
        // Sorting
        //Arrays.sort(nums);
        //return nums[nums.length/2];

        //Boyer Moore Voting Algorithm
        int count =0;
        int latestValue=0;
        for(int num: nums){
            if(count==0){
                latestValue = num;
            }
            count = latestValue == num ? ++count: --count;
        }
        return latestValue;
    }
}