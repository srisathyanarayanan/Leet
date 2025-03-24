class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }

        if(!word.matches("[a-zA-Z0-9]+")){
            return false;
        }
        boolean vowels = false,consonants = false;
        for(char c : word.toCharArray()){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    vowels =true;
                }else{
                    consonants = true;
                }

            }
        }
        return vowels&&consonants;
    }
}