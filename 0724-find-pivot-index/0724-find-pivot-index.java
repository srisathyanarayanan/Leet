class Solution {
    public int pivotIndex(int[] nums) {
         int i =0,j=nums.length-1;
        while(i<=j){
            int c = 0;
            int s = 0;
            for(int k=0;k<i;k++){

                c+=nums[k];
            }
            for(int k =i+1;k<=j;k++){

                s +=nums[k];
            }
            System.out.println(c);
            System.out.println(s);
            if(c==s){
                return i;
            }
            i++;
        }
        return -1;
    }
}