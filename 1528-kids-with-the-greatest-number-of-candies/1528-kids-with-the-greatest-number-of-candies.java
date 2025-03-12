class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int high = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>high){
                high = candies[i];
            }
        }
        for(int i:candies){
            int add= extraCandies + i;
            if(add<high){
                l.add(false);
            }else{
                l.add(true);
            }
        }
        return l;
    }
}