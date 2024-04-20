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
            System.out.println("mid=" +mid);

            if(numberOfHoursAsPerSpeed(mid,piles)<=h){
                System.out.println("numberOfHoursAsPerSpeed(mid,piles)= h : " +numberOfHoursAsPerSpeed(mid,piles));
                // answ = mid;
                end = mid;
                // System.out.println("numberOfHoursAsPerSpeed(mid,piles)= h : end = " +end);
            }
            // else if(numberOfHoursAsPerSpeed(mid,piles)<h){
            //     System.out.println("numberOfHoursAsPerSpeed(mid,piles)< h : " +numberOfHoursAsPerSpeed(mid,piles));
            //     //speed can be reduced
            //     end = mid-1;
            //     System.out.println("numberOfHoursAsPerSpeed(mid,piles)< h : end = " +end);
            // }
            else{
                System.out.println("numberOfHoursAsPerSpeed(mid,piles)> h : " +numberOfHoursAsPerSpeed(mid,piles));
                beg = mid+1;
                System.out.println("numberOfHoursAsPerSpeed(mid,piles)> h : beg = " +beg);

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