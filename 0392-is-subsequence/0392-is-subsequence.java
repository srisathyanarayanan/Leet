class Solution {
    public boolean isSubsequence(String s, String t) {
      int c=0;
        int n=0;
        int k =0;
        for(int i=0;i<s.length();i++){
            for(int j=k;j<t.length();j++){
                k++;
                if(s.charAt(i)==t.charAt(j)){
                if(j>=n){
                    n=j;
                    c++;
                    break;
                }
                }
            }
        }
        if(c==s.length()) return true;
        return false;   }
}