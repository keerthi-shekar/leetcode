class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        
        double maxAverage = (double) currentSum / k;
        
       
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxAverage = Math.max(maxAverage, (double) currentSum / k);
        }
        
        return maxAverage;
    }
}
