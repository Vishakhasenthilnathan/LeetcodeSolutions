class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        int slength = s.length();
        int tlength = t.length();
        while(tp<tlength && sp<slength){
            if(s.charAt(sp) == t.charAt(tp)){
                tp++;
                sp++;
            }
            else{
                tp++;
            }
        }
        return sp==slength;
    }
}