//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&difficulty[]=1&sortBy=submissions
class Solution
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        int vote = 1;
        int major = arr[0];
        for(int i = 1;i<size;i++){
            if(arr[i]==major){
                vote++;
            }
            else{
                vote--;
            }
            if(vote==0){
                major = arr[i];
                vote = 1;
            }
        }
        vote = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==major){
                vote++;
            }
        }
        if(vote>(size/2)){
            return major;
        }
        return -1;
    }
}
