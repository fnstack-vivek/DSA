class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        int l=hours.length;
        for(int i=0;i<l;i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
        
    }
}