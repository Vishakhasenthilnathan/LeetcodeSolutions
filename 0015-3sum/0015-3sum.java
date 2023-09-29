class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(list);
                    j++;
                    k--;
                   while(j<k && nums[j]==nums[j-1]) j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
            return result;
        
    }
}
