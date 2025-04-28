class Solution {
    public long findTheArrayConcVal(int[] nums) {
        List<Integer> l = new ArrayList<>();
        long n = 0;
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        while(l.size()>0){
            if(l.size()==1){
                n+=l.get(0);
                l.remove(0);
            }else{
                String s  = String.valueOf(l.get(0)) + String.valueOf(l.get(l.size()-1));
                n += Integer.parseInt(s);
                l.remove(0);
                l.remove(l.size() - 1);
            }
           
        }
        System.out.println(l);
        System.out.println(n);
        return n;
    }
}