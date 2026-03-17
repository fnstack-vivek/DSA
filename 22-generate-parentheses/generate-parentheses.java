class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");

        helper(n,n,res,sb);
        return res;
        
        
    }
    public void helper(int left,int right,List<String> res,StringBuilder sb){
        if(left==0 && right==0){
            res.add(sb.toString());
            return;
        }
        if(left>0){
        sb.append('(');
        helper(left-1,right,res,sb);
        sb.deleteCharAt(sb.length()-1);}
        if(right>left){
        sb.append(')');
        helper(left,right-1,res,sb);
         sb.deleteCharAt(sb.length()-1);}

    }
}