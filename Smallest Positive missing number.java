//https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int n = size;
        if(n == 1 && arr[0] != 1){
            return 1;
        }
        
        Arrays.sort(arr);
        if(n >= 2 && arr[0] > 1){
            return 1;
        }
        for(int i = 0;i < n;i++){
            
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        
        for(int i = 0;i < n-1;i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            if(arr[i]+1 != arr[i+1]){
                return arr[i]+1;
            }
            
        }
        
        return arr[n-1]+1;
    }
}
