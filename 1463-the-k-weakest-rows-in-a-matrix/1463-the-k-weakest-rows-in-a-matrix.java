class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j< mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
                map.put(i,count);
            }

        }
        List<Map.Entry<Integer,Integer>> sort = new ArrayList<>(map.entrySet());
        sort.sort(Map.Entry.comparingByValue());

        int[] weak = new int[k];
        for(int i=0;i<k;i++){
            weak[i] = sort.get(i).getKey();

        }
    return weak;
    }
}