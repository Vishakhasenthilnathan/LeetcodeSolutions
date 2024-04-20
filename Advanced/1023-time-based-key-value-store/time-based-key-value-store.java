class TimeMap {

    private HashMap<String, List<List<String>>> timeMap;

    public TimeMap() {
        timeMap = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        List<List<String>> existingMap = timeMap.getOrDefault(key,new ArrayList<List<String>>());
        List<String> newValuePair = Arrays.asList(value,String.valueOf(timestamp));
        existingMap.add(newValuePair);
        timeMap.put(key,existingMap);
    }
    
    public String get(String key, int timestamp) {
        List<List<String>> keyValueList = timeMap.getOrDefault(key,null);
        System.out.println("key" + key + " "+ timestamp);
        if(keyValueList==null) return "";

        int beg = 0;
        int end = keyValueList.size()-1;
        String ans ="";
        while(beg<=end){
            int mid = (beg+end)/2;
            if(Integer.parseInt(keyValueList.get(mid).get(1))<=timestamp){
                ans = keyValueList.get(mid).get(0);
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */