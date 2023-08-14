//https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1
class Solution{
    public int[] singleNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        
        for(int val : nums){
            if(set.contains(val)){
                set.remove(val);
            }
            else
                set.add(val);
        }
        
        int[] ans = new int[2];
        int i=0;
        for(int val : set){
          ans[i] = val;
          i++;
        } 
        Arrays.sort(ans);
        return ans;
    }
}
