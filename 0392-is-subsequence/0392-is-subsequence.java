class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        while(tp<t.length() && s.length()>0 ){
            if(sp< s.length() && s.charAt(sp) == t.charAt(tp)){
                tp++;
                sp++;
            }
            else{
                tp++;
            }
            // System.out.println("sp = "+ sp +" tp = "+ tp);
        }
        return sp==s.length();
    }
}