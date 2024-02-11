class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // int[] minArr = nums1;
        // int[] maxArr = nums2; 
        // if(nums1.length>nums2.length){
        //     minArr=nums2;
        //     maxArr=nums1;
        // }
        // HashMap<Integer, Integer> freqMap = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<minArr.length;i++){
        //     int count = freqMap.getOrDefault(minArr[i],0);
        //     freqMap.put(minArr[i], count+1);
        // }

        // int newIndex =0;
        // for(int j=0;j<maxArr.length;j++){
        //     int mapValue = freqMap.getOrDefault(maxArr[j],0);
        //     if(mapValue>0){
        //         list.add(maxArr[j]);
        //         freqMap.put(maxArr[j],mapValue-1);
        //     }
        // }

        // int[] result = new int[list.size()];
        // for(int i=0;i<result.length;i++){
        //     result[i] = list.get(i);
        // }

        // return result;


        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int p1=0,p2=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else if(nums2[p2]<nums1[p1]){
                p2++;
            }
            else{
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
        }
        
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i] = list.get(i);
        }

        return result;
    }
}