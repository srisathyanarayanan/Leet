class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0||j>=0||carry!=0){
            int bitA = (i>=0)? a.charAt(i)-'0':0;
            int bitB = (j>=0)? b.charAt(j)-'0':0;

            int sum = bitA+bitB+carry;
            s.append(sum%2);
            carry=sum/2;

            i--;
            j--;
        }
        return s.reverse().toString();
    }
}