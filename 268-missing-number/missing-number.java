class Solution {
    public int missingNumber(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }

        // for(int i=0;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         return i;
        //     }
        // }
        // return 0;

        int sum = 0;
        for(int i=0;i<=nums.length;i++){
            sum += i;
        }
        int arrSum = 0;
        for(int i=0;i<nums.length;i++){
            arrSum += nums[i];
        }
        return sum-arrSum;
    }
}