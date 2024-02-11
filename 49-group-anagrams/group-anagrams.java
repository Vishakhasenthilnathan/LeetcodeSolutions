class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] keyArr = str.toCharArray(); 
            // Arrays.sort(keyArr);
            char[] sortArr = new char[26];
            for(int i=0;i<str.length();i++){
                sortArr[str.charAt(i)-97]++;
            }
            String key = String.valueOf(sortArr);
            
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}