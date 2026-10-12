
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {
            q1.add(students[i]);
        }

        int j = 0;
        int rotations = 0;

        while (!q1.isEmpty() && rotations < q1.size()) {
            if (q1.peek() == sandwiches[j]) {
                q1.remove();
                j++;
                rotations = 0;
            } else {
                int top = q1.remove();
                q1.add(top);
                rotations++;
            }
        }

        return q1.size();
    }
}
