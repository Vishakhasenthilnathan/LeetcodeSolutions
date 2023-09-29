class Solution {
    public int strStr(String haystack, String needle) {
        // int i=0;
        // int j = needle.length();
        // while(j<=haystack.length()){
        //     String s = haystack.substring(i,j);
        //     if(s.equals(needle)){
        //         return i;
        //     }
        //     else{
        //         i++;
        //         j++;
        //     }
        // }
        // return -1;
        return haystack.indexOf(needle);
    }
}