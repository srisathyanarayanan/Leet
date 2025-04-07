class Solution {
    public int maximumValue(String[] strs) {
         int max =0 ;
        for(String i:strs){
            if(i.matches("\\d+")){
                System.out.println(i);
                int num = Integer.parseInt(i);
                if(num>max){
                    max = num;
                }
            }else{
                if(i.length()>max){
                    max=i.length();
                }
            }
        }
        System.out.println(max);
        return max;
    }
}