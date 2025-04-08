class Solution {
    public int minimumOperations(int[] nums) {
        

        int count =0;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        System.out.println(l);
        while(!isOperation(l)){
            count++;
                    if(l.size()<3){
                        l.clear();
                    }else {
                        l.subList(0, 3).clear();
                    }

            System.out.println(l);
        }
        System.out.println(isOperation(l));
        System.out.println(count);
       return count;
    }
    public boolean isOperation(List<Integer> nums){
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.size();i++){
            s.add(nums.get(i));
        }
        if(nums.size()==s.size()){
            return true;
        }else{
            return false;
        }

    }

    
}