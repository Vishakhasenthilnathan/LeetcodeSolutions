class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> uniqMap = new HashMap<>();
        int left=0; int right=0;
        var length = 0;
        while(right<s.length()){
            if(uniqMap.containsKey(s.charAt(right))){
                if(uniqMap.get(s.charAt(right))>=left){
                    left = uniqMap.get(s.charAt(right))+1;
                }
            }
            uniqMap.put(s.charAt(right),right);
            right++;
            length = Math.max(length, right-left);
        }
        return length;
    }
}