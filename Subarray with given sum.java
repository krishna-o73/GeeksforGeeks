//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start=0;
        int sum=0;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            while(sum>s && start<i){
                sum-=arr[start++];
            }
            if(s==sum){
                start++;
                i++;
                list.add(start);
                list.add(i);
                return list;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
    
}
