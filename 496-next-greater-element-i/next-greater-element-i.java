class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n = nums2.length;
       int n2=nums1.length;
        int[] res = new int[n2];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> freq=new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
          int  NGT = stack.isEmpty() ? -1 : stack.peek();
            freq.put(nums2[i],NGT);
            stack.push(nums2[i]);
        
        }
       
        for (int i = 0; i <nums1.length; i++) {
            res[i] = freq.get(nums1[i]);
        }
        return res;
    }
}