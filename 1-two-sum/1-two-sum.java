class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();
        
        for(int i = 0; i< nums.length; i++) {
            int left = target - nums[i];
            if(pair.containsKey(left)) {
                return new int [] {pair.get(left), i};
            } else  {
                pair.put(nums[i], i);
            }
        }
       
        return null;
    }
}