class Solution {
    int max;

    public int maximumSwap(int num) {
        max = num;

        char[] arr = String.valueOf(num).toCharArray();

        solve(arr, 0, false);

        return max;
    }

    void solve(char[] arr, int index, boolean swapped) {

        int value = Integer.parseInt(new String(arr));
        max = Math.max(max, value);

        if (index == arr.length || swapped) {
            return;
        }

        for (int i = index + 1; i < arr.length; i++) {

            
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            
            solve(arr, index + 1, true);

        
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        
        solve(arr, index + 1, false);
    }
}