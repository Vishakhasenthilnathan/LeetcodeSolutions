class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        char[] charArr = s.toLowerCase().toCharArray();
        while(l<r){
            if(!Character.isLetterOrDigit(charArr[l])){
                l++;
            }
            else if(!Character.isLetterOrDigit(charArr[r])){
                r--;
            }
            else{
                if(charArr[l] == charArr[r]){
                    l++;
                    r--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}