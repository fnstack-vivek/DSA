class Solution {
    public int percentageLetter(String s, char letter) {
        int l= s.length();
        int count=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
       int percentage = (int) Math.floor(((double) count / l) * 100);
       return percentage;

        
    }
}