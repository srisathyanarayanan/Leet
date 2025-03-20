class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            m.put(i,heights[i]);
        }
        System.out.println(m);
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(m.entrySet());
        l.sort(Map.Entry.comparingByValue());
        System.out.println(l);

        String[] s = new String[names.length];
        List<Integer> index = new ArrayList<>();
        for(Map.Entry<Integer,Integer> value : l){
            index.add(value.getKey());
        }
        System.out.println(index);
        for(int i=0;i<names.length;i++){
            s[i] = names[index.get(i)];
        }
        System.out.println(Arrays.toString(s));
        String[] s1 = new String[s.length];
        for(int i=s.length-1,j=0;i>=0;i--){
            s1[j++] =s[i];
        }
        System.out.println(Arrays.toString(s1));
        return s1;
    }
}