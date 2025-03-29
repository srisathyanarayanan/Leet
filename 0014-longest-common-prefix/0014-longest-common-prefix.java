class Solution {
    public String longestCommonPrefix(String[] strs) {
          String c ="";
        char[][] d = new char[strs.length][];
        System.out.println(d);

        for(int i=0;i<strs.length;i++){
           d[i] = strs[i].toCharArray();
        }
        for (char[] row : d) {
            System.out.println(row);
        }
        int minlength= strs[0].length();
        for(String s:strs) {
             minlength = Math.min(minlength,s.length());
        }
        System.out.println(minlength);
       for(int i=0;i<minlength;i++){
           char  current = d[0][i];
           for(int j=1;j<strs.length;j++){
               if(d[j][i]!=current){
                   return c;
               }
           }
           c+=current;

       }
        return c;
    }
}