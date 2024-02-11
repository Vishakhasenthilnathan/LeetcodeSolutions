class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] keyArr = str.toCharArray(); 
            Arrays.sort(keyArr);
            String key = new String(keyArr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>(Arrays.asList(str)));
            }
            else{
                map.get(key).add(str);
            }
        }
        List<List<String>> anagramListOfLists = new ArrayList<List<String>>();
        for(String key: map.keySet()){
            List<String> values = map.get(key);
            if(values.size()>0){
                anagramListOfLists.add(values);
            }
        }
        return anagramListOfLists;
    }
}