//https://practice.geeksforgeeks.org/problems/fraction-pairs-with-sum-1/1
class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
          int ans=0;
        HashMap<Integer,HashMap<Integer,Integer>>hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=numerator[i];
            int y=denominator[i];
            int g=gcd(x,y);
            x=x/g;
            y=y/g;
            int nx=y-x;
            if(hm.containsKey(nx) && hm.get(nx).containsKey(y))
            {
                ans=ans+hm.get(nx).get(y);
            }
            if(hm.containsKey(x))
            {
                HashMap<Integer,Integer>h = hm.get(x);
                h.put(y,h.getOrDefault(y,0)+1);
            }
            else
            {
                HashMap<Integer,Integer>h = new HashMap<>();
                h.put(y,1);
                hm.put(x,h);

            }
        }
        return ans;
    }
     static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}
        
