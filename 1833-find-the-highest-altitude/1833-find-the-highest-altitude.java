class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + gain[i-1];
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
}