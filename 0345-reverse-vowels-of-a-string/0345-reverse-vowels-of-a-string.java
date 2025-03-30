class Solution {
    public String reverseVowels(String s) {
         String q = "";
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                q+=c;
            }
        }
        System.out.println(q);
        int j=q.length()-1;
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1){
                arr[i] = q.charAt(j--);
            }
        }
        System.out.println(Arrays.toString(arr));
        return new String(arr);
    }
}