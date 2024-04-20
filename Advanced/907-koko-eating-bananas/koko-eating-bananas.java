class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // find the range to apply binary search
        // it shud be 1 - maxValue in the pile
        int maxValueInPile = Arrays.stream(piles).max().getAsInt();

        int beg = 1;
        int end = maxValueInPile;
        //after getting the max, apply binary search such that the sum of the time got from the speed is equal to k
       int mid =0;
       int answ= 0;
        while(beg<end){
            mid = (beg+end)/2;
            if(numberOfHoursAsPerSpeed(mid,piles)<=h){
                end = mid;
            }
            else{
                beg = mid+1;
            }
        }
        return end;
    }

    public int numberOfHoursAsPerSpeed(int speedOfEating, int[] piles){
        int totalHoursSpentEating = 0;
        for(int i=0;i<piles.length;i++){
            int hoursSpentOnEatingIthPile=0;
            if(piles[i]%speedOfEating==0){
                hoursSpentOnEatingIthPile = piles[i]/speedOfEating;
            }
            else{
                hoursSpentOnEatingIthPile = (piles[i]/speedOfEating) + 1;
            }
            totalHoursSpentEating += hoursSpentOnEatingIthPile;
        }
        return totalHoursSpentEating;
    }
}