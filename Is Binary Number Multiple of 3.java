//practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1
class Solution {
    int isDivisible(String s){
    	    //complete the function here
    	    int odd=0,even=0;
    	    for(int i=s.length()-1;i>=0;i--)
    	    {
    	        if(s.charAt(i)=='1')
    	        {
    	            if(i%2==0)
    	            {
    	                even++;
    	            }
    	            else
    	            {
    	                odd++;
    	            }
    	        }
    	    }
    	    if((odd-even)%3==0)
    	    {
    	        return 1;
    	    }
    	    return 0;
    	}
}
