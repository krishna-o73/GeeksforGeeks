//https://practice.geeksforgeeks.org/problems/lemonade-change/1
class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int f=0,t=0;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                f++;
            }
            if(f==0){
                return false;
            }
            if(bills[i]==10){
                t++;
                f--;
            }
            if(bills[i]==20){
                if(t==0){
                    f=f-3;
                }
                else{
                    t--;
                    f--;
                }
            }
        }
        if(f>=0)
            return true;
        else
            return false;
    }
}
