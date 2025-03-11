class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a = "";
        int i=0,j=0;
        int n=word1.length(),m=word2.length();

        while(i<n && j<m){
            if(i==j) {
                a += word1.charAt(i);
                i++;
            }else{
                a +=word2.charAt(j);
                j++;
            }
        }
        while(i<n){
            a +=word1.charAt(i);
            i++;
        }
        while(j<m){
            a +=word2.charAt(j);
            j++;
        }
        return a;
    }
}