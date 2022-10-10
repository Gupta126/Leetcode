class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int size = nums.length;
        
        int count = 0;
        
        int i = 0;
        int j = 1;
        
        int prevI =  Integer.MIN_VALUE, prevJ = Integer.MIN_VALUE;
        while(i < size && j < size ) {
            if(i != j && Math.abs(nums[i] - nums[j]) == k) {
                
                if(prevI != nums[i] && prevJ != nums[j]) {
                    count++;    
                }
                prevI = nums[i];
                prevJ = nums[j];
                j++;
                i++;
            } else if(Math.abs(nums[i] - nums[j]) > k) {
                i++;
            } else {
                j++;
            }
            
        }
        
        return count;
    }
}