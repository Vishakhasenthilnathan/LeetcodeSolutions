class Solution {
    public int search(int[] nums, int target) {
        //BS approach
        int beg = 0;
        int end = nums.length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                //find the sorted arr
                if(nums[beg] <= nums[mid]){
                    if(target >= nums[beg] && target <= nums[mid]){
                        //this is the half containing target
                        end = mid-1;
                    }
                    else{
                        beg = mid+1;
                    }
                }
                else if(nums[mid] <= nums[end]){
                   if(target <= nums[end] && target >= nums[mid]){
                        //this is the half containing target
                        beg = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }

            }   
        }
        return -1;
    }
}