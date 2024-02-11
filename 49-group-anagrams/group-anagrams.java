class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] keyArr = str.toCharArray(); 
            Arrays.sort(keyArr);
            String key = String.valueOf(keyArr);
            
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}