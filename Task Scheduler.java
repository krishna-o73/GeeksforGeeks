//https://practice.geeksforgeeks.org/problems/task-scheduler/1
class Solution {
    public int leastInterval(int N, int k, char[] tasks) {
        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        
        Arrays.sort(taskCount);
        
        int maxCount = taskCount[25] - 1;
        int idleSlots = maxCount * k;
        
        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            idleSlots -= Math.min(taskCount[i], maxCount);
        }
        
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
