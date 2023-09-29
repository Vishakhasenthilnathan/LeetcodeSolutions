class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magazineMap = new HashMap<>();
        for(var mag : magazine.toCharArray()){
            int val = magazineMap.getOrDefault(mag,0);
            if(val == 0){
                magazineMap.put(mag,1);
            }
            else{
                magazineMap.put(mag,val+1);
            }
        }

        for(var ran : ransomNote.toCharArray()){
            var val = magazineMap.getOrDefault(ran,0);
            if(val>0){
                magazineMap.put(ran,val-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}