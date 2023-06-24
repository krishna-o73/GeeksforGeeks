//https://practice.geeksforgeeks.org/problems/prefix-match-with-other-strings/1
class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        int c=0;
        String str1="";
        if(k<=str.length())
            str1=str.substring(0,k);
        else{
            str1=str;
            return c;
        }
        for(int i=0;i<n;i++){
            String str2=arr[i];
            String str3="";
            if(k<str2.length()){
                str3=str2.substring(0,k);
                if(str1.equals(str3)==true){
                c++;
                }
            }
            else{
                str3=str2;
                if(str1.equals(str3)==true){
                c++;
                }
            }
        }
        return c++;
    }
}
