class Solution {
    public int findFinalValue(int[] nums, int original) {
      List<Integer> l = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
                l.add(nums[i]);
        }
        System.out.println(l);
        int n=original;
        while(l.contains(n)){

                n*=2;
        }
      return n;
    }
}