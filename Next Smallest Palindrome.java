//https://practice.geeksforgeeks.org/problems/next-smallest-palindrome4740/1
class Solution {

    Vector<Integer> generateNextPalindrome(int arr[], int n) {
        // code her
    Vector <Integer>ans=new Vector<>();
    if(n==1&&arr[0]!=9)
    {
        ans.add(arr[0]+1);
        return ans;
    }
    if(ifAllNine(arr))
    {
        int l=arr.length-1;
        ans.add(1);
        while(l>0)
        {
            ans.add(0);
            l--;
        }
        ans.add(1);
        return ans;
        
    }
int mid=0;
if(n%2==0)
{
    
    mid=(n/2)-1;
    if(isLarge_even(arr,mid))
    {
        int carry=1;
        int i=mid;
        while(i>=0)
        {
            int temp=arr[i]+carry;
            int mod=temp%10;
            ans.add(mod);
            carry=temp/10;
            i--;
        }
        ArrayList<Integer>list=new ArrayList<>(ans);
        
        Collections.reverse(ans);
        for(int j:list)
        {
            ans.add(j);
        }
        
    }
  else  {
        //when the left part is not greater than right
        
        int i=mid;
        while(i>=0)
        {
            ans.add(arr[i]);
            i--;
        }
        ArrayList<Integer>list=new ArrayList<>(ans);
        
        Collections.reverse(ans);
        for(int j:list)
        {
            ans.add(j);
        }
    }
}
else{
    mid=n/2;
    if(isLargerOdd(arr,mid)){
                int carry=1;
        int i=mid;
        while(i>=0)
        {
            int temp=arr[i]+carry;
            int mod=temp%10;
            ans.add(mod);
            carry=temp/10;
            i--;
        }
       ArrayList<Integer>list=new ArrayList<>(ans);
  
        
        Collections.reverse(ans);
        
       // int l=mid-1;
        for(int j=1;j<=mid;j++)
        {
            ans.add(list.get(j));
        }
        
    }
    else{
        int i=mid;
        while(i>=0)
        {
            ans.add(arr[i]);
            i--;
        }
              ArrayList<Integer>list=new ArrayList<>(ans);

        
        Collections.reverse(ans);
        
       int l=0;
        for(int j=1;j<=mid;j++)
        {
            ans.add(list.get(j));
        }
         
    }
    
}
return ans;
    
    }
    
    public boolean isLarge_even(int[]arr,int mid)
    {
        int i=mid,j=mid+1;
        while(i>=0&&j<arr.length&&(arr[i]==arr[j]))
        {
            i--;
            j++;
        }
        if((i<0&&j>=arr.length)||arr[i]<arr[j])
        return true;

return false;
    }
    public boolean isLargerOdd(int []arr,int mid)
    {
                int i=mid-1,j=mid+1;
        while(i>=0&&j<arr.length&&(arr[i]==arr[j]))
        {
            i--;
            j++;
        }
        if((i<0&&j>=arr.length)||arr[i]<arr[j])
        return true;

return false;
    }
 public boolean   ifAllNine(int []arr)
    {
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=9)
        return false;
    }
    return true;
    }
}

