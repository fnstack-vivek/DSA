// class Solution {
//     public int findNthDigit(int n) {
//         StringBuilder sb = new StringBuilder();
       
//         for(int i=1;i<=n;i++){
//             sb.append(i);
//         }
//        char res=sb.charAt(n-1);

        
     
//       return res-'0';
          
//     }
// }
class Solution {
    public int findNthDigit(int n) {
        long base = 9;
        int digits = 1;
        long start = 1;

        
        while (n > base * digits) {
            n -= base * digits;
            digits++;
            base *= 10;
            start *= 10;
        }

       
        start += (n - 1) / digits;
        String s = String.valueOf(start);

       
        return s.charAt((n - 1) % digits) - '0';
    }
}