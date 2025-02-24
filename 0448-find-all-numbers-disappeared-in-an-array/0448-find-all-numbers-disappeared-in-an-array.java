class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> out = new ArrayList<>();

        
        Set<Integer> seen = new HashSet<>();
        for(int n:nums){
            seen.add(n);
        }
        for(int i=1;i<=nums.length;i++){
            if(!seen.contains(i)){
                out.add(i);
            }
        }
        return out;
    }
}