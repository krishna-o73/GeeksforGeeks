//https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
class Solution
{
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
       for(int i=0;i<n;i++)
       {
           int j = i+1;
           int k = n-1;
            while(j<k){
            int sum = arr[i] + arr[j] + arr[k];
            if(sum == 0){
                return true;
            }
            else if(sum > 0){
                k--;
            }
            else{
                j++;
            }
            
        }
       }
       return false;
    }
}
