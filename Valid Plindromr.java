class Solution {
    public boolean isPalindrome(String s) {

        String clean = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                clean += Character.toLowerCase(c);
            }
        }
        String rev = "";

        for(int i = clean.length() - 1; i >= 0; i--){
            rev += clean.charAt(i);
        }

        if(clean.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}