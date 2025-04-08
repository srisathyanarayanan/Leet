class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l = new ArrayList<>();
         for(String s : operations){
             System.out.println(s);
             if(s.matches("-?\\d+")){
                 l.add(Integer.parseInt(s));
             }
             else if(s.equals("C")){
                 l.remove(l.size()-1);
             }else if(s.equals("D")){
                 int c =l.get(l.size()-1) * 2;
                 l.add(c);
             }else if(s.equals("+")){
                 int c = l.get(l.size()-1) + l.get(l.size()-2);
                 l.add(c);
             }
             System.out.println(l);
         }
         int a=0;
         for(int i=0;i<l.size();i++){
             a+=l.get(i);
         }
         return a ;
    }
}