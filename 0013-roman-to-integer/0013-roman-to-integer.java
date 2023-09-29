class Solution {
    public int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        int integerValue = 0;
        int currVal = 0;
        int prevValue =0;
        
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)) {
                case 'I' :
                    currVal = 1;
                    break;
                case 'V' :
                    currVal = 5;
                    break;
                case 'X' :
                    currVal = 10;
                    break;
                case 'L' :
                    currVal = 50;
                    break;
                case 'C' :
                    currVal = 100;
                    break;
                case 'D' :
                    currVal = 500;
                    break;
                case 'M' :
                    currVal = 1000;
                    break;
            }


            if(prevValue < currVal){
                integerValue = integerValue - prevValue + (currVal - prevValue);
            }
            else{
                integerValue += currVal;
            }
            prevValue = currVal;
        }
        return integerValue;
    }
}