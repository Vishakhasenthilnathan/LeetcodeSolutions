class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        while(tp<t.length()){
            if(sp< s.length() && s.charAt(sp) == t.charAt(tp)){
                tp++;
                sp++;
            }
            else{
                tp++;
            }
        }
        return sp==s.length();
    }
}