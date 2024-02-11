class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        if(nums.length<3){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            int currentElement = nums[i];
            if(currentElement<=first){
                first = currentElement;
            }
            else if(currentElement<=second){
                second = currentElement;
            }
            else{
                return true;
            }
        }
        return false;
    }
}