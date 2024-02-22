class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        if(first==-1 || last ==-1){
            return new int[]{-1,-1};
        }
        return new int[]{first, last};
    }

    static int findFirst(int a[], int k){
        int beg = 0;
        int end = a.length-1;
        int first=-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(a[mid]==k){
                first = mid;
                end = mid-1;
            }
            else if(a[mid]<k){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;
    }

    static int findLast(int a[], int k){
        int beg = 0;
        int end = a.length-1;
        int last=-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(a[mid]==k){
                last = mid;
                beg = mid+1;
            }
            else if(a[mid]<k){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return last;
    }
}