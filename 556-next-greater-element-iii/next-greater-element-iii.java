class Solution {
    public int nextGreaterElement(int n) {
        //iterate and find the dip such that c[i] < c[i+1]
        //find the next larger number than dip
        //swap
        //reverse the numbers from dip to end

        if(!(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE)){
            return -1;
        }
        char[] arr = Integer.toString(n).toCharArray();
        int end = arr.length-1;
        int dip = -1;
        int i = end-1;
        while(i>=0){
            if(arr[i]<arr[i+1]){
                dip = i;
                break;
            }
            i--;
        }

        if(dip==-1) return dip;

        int j = end;
        while(j>i){
            if(arr[j]>arr[dip]){
                break;
            }
            j--;
        }

        char temp = arr[dip];
        arr[dip] = arr[j];
        arr[j] = temp;

        Solution.reverse(arr,i+1,end);
        
        int result = -1;
        try{
         result = Integer.parseInt(String.valueOf(arr));
         return result;
        }
        catch(Exception e){
            return -1;
        }
    }

    public static void reverse(char[] arr, int left, int right){
        while(left<=right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}