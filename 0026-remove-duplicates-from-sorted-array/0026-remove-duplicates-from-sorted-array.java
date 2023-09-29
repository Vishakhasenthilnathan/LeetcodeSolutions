class Solution {
    public int removeDuplicates(int[] nums) {
        int reader =0; int writer =0;
        HashSet<Integer> uniqueVal = new HashSet<>();
        while(reader < nums.length){
            if(uniqueVal.contains(nums[reader])){
                reader++;
            }
            else{
                uniqueVal.add(nums[reader]);
                nums[writer++] = nums[reader++];
            }
        }
        return writer;
    }
}