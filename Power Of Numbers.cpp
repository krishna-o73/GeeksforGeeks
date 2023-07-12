//https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
class Solution{
    public:
    
    int m=1000000007;
    long long power(int N,int R)
    {
        long long ans=1;
        long long base=N%m;
        while(R>0){
            if(R%2!=0){
                ans=(ans*base)%m;
            }
            base=(base*base)%m;
            R=R/2;
        }
        return ans;
    }

};
