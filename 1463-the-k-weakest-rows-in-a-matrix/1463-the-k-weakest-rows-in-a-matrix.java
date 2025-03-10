class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
         List<Integer> l =new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int[] i:mat){
            int c=0;
            for(int j:i){
                if(j==1) {
                    c++;
                }
            }
            l.add(c);
        }
        for(int i=0;i<l.size();i++){
            l1.add(l.get(i));
        }
        Collections.sort(l1);
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.size();j++){
                if(l2.contains(j)){
                    continue;
                }
                 if(Objects.equals(l1.get(i), l.get(j))){
                    l2.add(j);
                }
            }
        }
        int[] weak = new int[k];
        for(int i=0;i<k;i++){
            weak[i]= l2.get(i);
        }
        return weak;
    }
}