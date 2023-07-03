//https://practice.geeksforgeeks.org/problems/maximum-index3307/1
class solution{
public:
    int maxIndexDiff(int arr[], int n) {
    int *LMin = new int[(sizeof(int) * n)]; 
    int *RMax = new int[(sizeof(int) * n)]; 
    LMin[0] = arr[0]; 
    for (int i = 1; i < n; ++i) 
        LMin[i] = min(arr[i], LMin[i - 1]); 
    RMax[n - 1] = arr[n - 1]; 
    for (int j = n - 2; j >= 0; --j) 
        RMax[j] = max(arr[j], RMax[j + 1]); 
    int i = 0, j = 0, maxDiff = -1; 
    while (j < n && i < n) { 
        if (LMin[i] <= RMax[j]) { 
            maxDiff = max(maxDiff, j - i); 
            j = j + 1; 
        } else
            i = i + 1; 
    } 
    return maxDiff; 
    }
};
