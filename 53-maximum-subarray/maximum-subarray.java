class Solution {
    public int maxSubArray(int[] nums) {
    
        //KADANE ALGORITHM
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            if(currentSum > maxSum)
                maxSum = currentSum;

            //Very important - done to avoid negatives in sum to obtain the maximum possible sum of subarray
            if(currentSum < 0)
                currentSum = 0;
        }

        return maxSum;
    }
}