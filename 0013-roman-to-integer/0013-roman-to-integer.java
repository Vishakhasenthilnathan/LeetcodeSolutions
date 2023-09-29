class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanToValueMap = new HashMap<Character,Integer>();
        romanToValueMap.put('I',1);
        romanToValueMap.put('V',5);
        romanToValueMap.put('X',10);
        romanToValueMap.put('L',50);
        romanToValueMap.put('C',100);
        romanToValueMap.put('D',500);
        romanToValueMap.put('M',1000);

        char[] charArr = s.toCharArray();
        int integerValue = 0;
        for(int i=0;i<s.length();i++){
            var currentValue = romanToValueMap.get(charArr[i]);
            var prevValue = i==0 ? 0 : romanToValueMap.get(charArr[i-1]);
            if(prevValue < currentValue){
                integerValue = integerValue - prevValue + (currentValue - prevValue);
            }
            else{
                integerValue += currentValue;
            }
        }
        return integerValue;
    }
}