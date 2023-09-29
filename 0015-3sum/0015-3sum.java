class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n =nums.length;
        for(int i=0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(list);
                    j++;
                    k--;
                   while(j<k && nums[j]==nums[j-1]) j++;
                //    while(k>0 && nums[k]==nums[k+1]) k--;
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
