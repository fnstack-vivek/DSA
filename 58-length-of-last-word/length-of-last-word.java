class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int count=0;

        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){
               count=words[i].length();
               break; 
            }
            
        }
        
        return count;
       

        
    }
}