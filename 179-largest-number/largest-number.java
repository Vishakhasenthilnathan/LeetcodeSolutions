class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]; 
        }
        Arrays.sort(arr,(a,b)->(String.valueOf(b)+a).compareTo(String.valueOf(a)+b));

        if(arr[0]==0){
            return "0";
        }
        StringBuilder s = new StringBuilder();
        for(var a:arr){
            s.append(a);
        }

        return s.toString();
    }
}