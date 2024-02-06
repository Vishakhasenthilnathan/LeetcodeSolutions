class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int sum=0;
        for(int i=digits.length-1;i>=0&& carry!=0;i--){
            sum = digits[i]+carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry==1){
            int[] newDigit = new int[digits.length+1];
            newDigit[0]=1;
            return newDigit;
        }
        return digits;
    }
}