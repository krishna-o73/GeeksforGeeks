//https://practice.geeksforgeeks.org/problems/next-happy-number4538/1
class Solution{

    static int nextHappy(int N){
        // code here
        for(int i=N+1;i<2147483646;i++){
            if(check(i)==true){
                return i;
            }
        }
        return 0;
    }
    static boolean check(int n){
        int k=10;
        int a=n;
        while(k!=0){
            a=fact(a);
            if(a/10==0){
                if(a==1||a==7){
                    return true;
                }
                else{
                    return false;
                }
            }
            k=a/10;
        }
        return false;
    }
    static int fact(int n){
        int s=0;
        int r=0;
        while(n!=0){
            r=n%10;
            s=s+r*r;
            n=n/10;
        }
        return s;
    }
}
