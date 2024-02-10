class Solution {
    public int removeDuplicates(int[] nums) {
        /*
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
        */
        
        //Without extra space
        int writer=0,reader=0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int count =0;
            while(reader < nums.length && val==nums[reader]){
                reader++;
                count++;
            }

            if(count>2){
                count = 2;
            }

            for(int j=0;j<count;j++){
                nums[writer++] = val;
            }
        }
        return writer;
    }
}