class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum = n *(n+1)/2;
        int ActualSum = 0;
        for(int a:nums){
            ActualSum +=a;
        }
        return sum-ActualSum;
    }
}