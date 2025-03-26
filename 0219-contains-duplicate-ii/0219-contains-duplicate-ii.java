class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> m = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if (m.containsKey(nums[i])) {
                int prevIndex = m.get(nums[i]);
                if (Math.abs(i - prevIndex) <= k) {
                    return true;  // Found a duplicate within range
                }
            }
            m.put(nums[i],i);
        }
        return false;
    }
}