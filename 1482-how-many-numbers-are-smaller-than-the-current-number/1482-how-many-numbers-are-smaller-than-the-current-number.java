class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int count =0;
        int[] out = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count++;
                }
                out[i]=count;
            }
            count = 0;
        }
        return out;
    }
}