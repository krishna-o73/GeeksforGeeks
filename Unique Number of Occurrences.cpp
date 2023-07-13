//https://practice.geeksforgeeks.org/problems/unique-frequencies-of-not/1
class Solution
{
    public:
    bool isFrequencyUnique(int n, int arr[])
    {
        unordered_map<int,int> m;
        for(auto i=0;i<n;i++){
            m[arr[i]]++;
        }
        vector<int> vec;
        set<int> s;
        for(auto y:m){
            vec.push_back(y.second);
            s.insert(y.second);
        }
        if(s.size()==vec.size()) return true;
        else return false;
    }
};
