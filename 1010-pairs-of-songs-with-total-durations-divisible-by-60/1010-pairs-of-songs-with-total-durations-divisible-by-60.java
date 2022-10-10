class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int mod = 60;
        
        long[] rm = new long [mod];
        
        long ans = 0;
        for(int i = 0; i < time.length; i++) {
            rm[time[i] % mod]++;
        }
        // for 0th position;
        ans = (rm[0] * (rm[0] -1)) /2;
        
        // for the middle position 30th.  
        
        ans = ans + (rm[mod/2] * (rm[mod/2] -1)) /2;
        
        int i = 1, j = mod - 1;
        
        while(i < j) {
            ans += (rm[i] * rm[j]);
            j--;
            i++;
        }
        
        return (int) ans;
    }
}