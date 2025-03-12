class Solution {
    public String reverseWords(String s) {
       String[] d = s.split(" ");
        String f = "";
        for(int i=d.length-1;i>=0;i--){
            if(d[i]==""){
                continue;
            }else{
                f += d[i] + " ";
            }
        }
        f=f.trim();
        return f; 
    }
}