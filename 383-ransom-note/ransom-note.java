class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> s1=new HashMap<>();
      
        for(char c: magazine.toCharArray()){
            s1.put(c,s1.getOrDefault(c,0)+1);

        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(!s1.containsKey(c)||s1.get(c)==0){
                return false;
            }
            else{
                s1.put(c,s1.get(c)-1);
            }
        }

      
        return true;
        
        
    }
}