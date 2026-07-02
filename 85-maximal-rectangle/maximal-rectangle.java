import java.util.Stack;

class Solution {
    public static int getMaxArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length;

        int[][] heights = new int[m][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == '1') {
                    heights[i][j] = (i == 0) ? 1 : heights[i - 1][j] + 1;
                } else {
                    heights[i][j] = 0;
                }
            }
        }

        int max = 0;
        for (int[] row : heights) {
            int area = getMaxArea(row);
            max = Math.max(max, area);
        }
        return max;
    }
}