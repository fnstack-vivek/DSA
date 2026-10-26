class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(arr,0,ans,temp);
        return ans;
        
    }
    public static void solve(int[] arr,int i, List<List<Integer>> ans,List<Integer> temp){
        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        solve(arr,i+1,ans,temp);
        temp.remove(temp.size()-1);
        solve(arr,i+1,ans,temp);
    }
}