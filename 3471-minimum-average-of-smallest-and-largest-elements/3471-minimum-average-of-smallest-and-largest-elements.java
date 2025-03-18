class Solution {
    public double minimumAverage(int[] nums) {
         List<Double> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            l1.add(nums[i]);
        }
        while (!l1.isEmpty() && l1.size() > 1) {  
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int minIndex = -1, maxIndex = -1;

            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i) < min) {
                    min = l1.get(i);
                    minIndex = i;
                }
                if (l1.get(i) > max) {
                    max = l1.get(i);
                    maxIndex = i;
                }
            }

            l1.remove(Math.max(minIndex, maxIndex));
            l1.remove(Math.min(minIndex, maxIndex));


            double c = ((double)min + (double) max)/ 2;
            l.add(c);
        }
        Collections.sort(l);


        return l.get(0);
    }
}