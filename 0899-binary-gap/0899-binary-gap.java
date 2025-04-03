class Solution {
    public int binaryGap(int n) {
         String s = "";
       while(n>0){
            s = (n%2) + s;
           n/=2;
       }
        System.out.println(s);
         int w =0;
        int q = s.length();
      for(int i=0;i<s.length();i++){

          for (int j=i+1;j<s.length();j++){
              if(s.charAt(i) =='1'&& s.charAt(j)=='1' ){
                  q=j;
                  System.out.println(j-i);
                  System.out.println(j);
                  System.out.println(i);
                  w = Math.max(w,j-i);
                  break;
              }
          }

      }
        if(w!=0){
            return w;
        }
       return 0;
    }
}