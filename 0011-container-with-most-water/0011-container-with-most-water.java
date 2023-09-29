class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;
        int minHeight = 0;
        while(left<right){
            minHeight = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,(minHeight * (right - left)));
            if(height[right]>height[left]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}