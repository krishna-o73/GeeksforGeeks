//https://practice.geeksforgeeks.org/problems/quick-sort/1
void quickSort(int arr[], int low, int high)
{
    // code here
    if(low<high){
        int j=partition(arr,low,high);
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }
}
    
int partition (int arr[], int low, int high)
{
   // Your code here
   int p=arr[high];
   int i=low-1;
   int n=0;
   for(int j=low;j<high;j++){
       if(arr[j]<p){
           i++;
           n=arr[i];
           arr[i]=arr[j];
           arr[j]=n;
           
       }
   }
    n=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=n;
    return i+1;
}
