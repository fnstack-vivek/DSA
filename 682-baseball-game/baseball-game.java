class Solution {
    public int calPoints(String[] given) {
        Stack<Integer> st = new Stack<>();
        int l = given.length;
        
        for (int i = 0; i < l; i++) {
            String ch = given[i];
            
            if (ch.equals("C")) {
                st.pop();
            } 
            else if (ch.equals("D")) {
                st.push(st.peek() * 2);
            } 
            else if (ch.equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);          
                st.push(top1 + top2);  
            } 
            else {
                st.push(Integer.parseInt(ch));
            }
        }
        
        int sum = 0;
        for (int score : st) {
            sum += score;
        }
        return sum;
    }
}