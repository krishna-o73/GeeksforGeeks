//https://practice.geeksforgeeks.org/problems/set-bits0143/1
class Solution {
    static int setBits(int N) {
        // code here
        String s = Integer.toBinaryString(N);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
