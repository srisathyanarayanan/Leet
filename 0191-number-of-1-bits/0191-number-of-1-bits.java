class Solution {
    public int hammingWeight(int n) {
        String s ="";
        int c =0;
        while(n>0){
            s+=(n%2);
            if(n%2==1)c++;
            n/=2;
        }
        return c;
    }
}