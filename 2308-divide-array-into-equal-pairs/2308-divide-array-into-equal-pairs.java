class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length/2;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i] == nums[i+1]){
                count++;
            }
        }
        if(n==count){
            return true;
        }else{
            return false;
        }
    }
}