class Solution {
    public int removeDuplicates(int[] nums) {
        int writer=0,reader=0;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        while(reader<nums.length){
            int valueInMap = freqMap.getOrDefault(nums[reader],0);
            if(valueInMap>=2){
                reader++;
            }
            else{
                freqMap.put(nums[reader], valueInMap+1);
                nums[writer++] = nums[reader++];
            }
        }
        return writer;
    }
}