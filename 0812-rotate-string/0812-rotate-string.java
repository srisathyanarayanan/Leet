class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        char[] c = s.toCharArray();
        char[] c1 = goal.toCharArray();
        for(int i=0;i<c.length;i++){
            char temp = s.charAt(i);
            for(int j=0;j<c.length-1;j++){
                c[j] =c[j+1];
            }
            c[c.length-1]=temp;
            System.out.println(Arrays.toString(c));
            if(Arrays.equals(c,c1)){
                return true;
            }

        }
        return false;
    }
}