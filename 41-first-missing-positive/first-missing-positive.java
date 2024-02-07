class Solution {
    public int firstMissingPositive(int[] nums) {
        //we can find in o(n) loop
        //store the non negative integers in a set to make use of a set method, contains()
        HashSet<Integer> set = new HashSet<>();
        for(int val: nums){
            if(val>0){
                //This takes O(n)
                set.add(val);
            }
        }

        for(int i=1;i<=set.size()+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }
}