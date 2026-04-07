class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        st.push(asteroids[0]);

        for (int i = 1; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (curr > 0) {
                st.push(curr);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(curr)) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(curr)) {
                    st.pop();
                } 
                
                else if (st.isEmpty() || st.peek() < 0) { 
                    st.push(curr);
                }
            }
        }
        int[] arr = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}