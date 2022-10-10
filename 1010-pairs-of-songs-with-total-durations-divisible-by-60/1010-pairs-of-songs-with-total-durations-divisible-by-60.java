class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int mod = 60;
        
        long[] rm = new long [mod];
        Map<Integer, Long> counter = new HashMap<Integer, Long>();
        
        long ans = 0;
        for(int i = 0; i < time.length; i++) {
            counter.put(time[i] %mod, counter.getOrDefault((time[i] % mod), 0l) +1);
        }
        // for 0th position;
        ans = (counter.getOrDefault(0, 0l) * (counter.getOrDefault(0, 0l) -1)) /2;
        
        // for the middle position 30th.  
        
        ans = ans + (counter.getOrDefault(mod/2, 0l) * (counter.getOrDefault(mod/2, 0l) -1)) /2;
        
        int i = 1, j = mod - 1;
        
        while(i < j) {
            ans += (counter.getOrDefault(i, 0l) * counter.getOrDefault(j, 0l));
            j--;
            i++;
        }
        
        return (int) ans;
    }
}