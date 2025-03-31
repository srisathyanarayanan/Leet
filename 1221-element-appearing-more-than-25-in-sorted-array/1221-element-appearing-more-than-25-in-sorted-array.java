class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
         int n =(int) (0.25 * arr.length);
        System.out.println(n);
        int c =1 ;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }else{
                c=1;
            }
            System.out.println(c);

            if(c>n){
                return arr[i];
            }
        }
        return -1;
    }
}