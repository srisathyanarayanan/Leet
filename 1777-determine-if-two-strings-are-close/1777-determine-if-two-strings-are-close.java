class Solution {
    public boolean closeStrings(String word1, String word2) {
       List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        char[] ca= word1.toCharArray();
        char[] c1 = word2.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(c1);
        HashSet<Character> s = new HashSet<>();
        for(char i:ca){
            s.add(i);
        }
        System.out.println(s);
        HashSet<Character> t = new HashSet<>();
        for(char i:c1){
            t.add(i);
        }

        int c =1 ;
        if(ca.length== c1.length && s.equals(t)){
            for(int i=0;i<ca.length-1;i++){
                    if(ca[i]==ca[i+1]){
                        c++;
                    }else{
                        l.add(c);
                        c=1;
                }
            }
            l.add(c);
            c=1;
            System.out.println(l);
            System.out.println(l);
            for(int i=0;i<c1.length-1;i++){
                if(c1[i]==c1[i+1]){
                    c++;
                }else{
                    l1.add(c);
                    c=1;
                }
            }
            l1.add(c);
            c=0;
            System.out.println(l1);
        }else{
            return false;
        }
        Collections.sort(l);
        Collections.sort(l1);
        System.out.println(l);

        s.clear();
        t.clear();

        if(l.equals(l1)){
            return true;
        }else{
            return false;
        }
    }
}