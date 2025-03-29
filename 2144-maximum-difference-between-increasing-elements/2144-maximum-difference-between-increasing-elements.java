class Solution {
    public int maximumDifference(int[] nums) {
           int max = nums[0];
        int diff = -1;
        for(int i=1;i<nums.length;i++){

                if (nums[i] > max ) {
                    diff = Math.max(diff, nums[i]-max);
                    System.out.println(diff);

                }else{
                    max  = nums[i];
            }
        }
        return diff;
    
    }
}