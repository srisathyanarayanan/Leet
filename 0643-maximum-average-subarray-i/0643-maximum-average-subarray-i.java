class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double r=0;
        int sum =0;
        for(int i=0;i<=k;i++){
            if(i==k){

                r= (double)sum/k;
                break;
            }
            sum+=nums[i];
        }
    
        double s = r;
        for(int i=1;i<=nums.length-k;i++){
            sum = sum+(nums[i+(k-1)]-nums[i-1]);
            
            r= (double)sum/k;
            System.out.println(r);
            s = Math.max(s,r);
        }

        return s;
    }
}