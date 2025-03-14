class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newi= new int[nums.length];

        int product = 1;
        int n=0;
        for(int i:nums){
            if(i==0){
                n++;
            }else{
                product*=i;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(n>1){
                newi[i]=0;
            }else if(n==1){
                newi[i]=(nums[i]==0)?product:0;
            }else{
                newi[i]=product/nums[i];
            }
        }
        return newi;
    }

}