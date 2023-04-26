class Solution {
    public int maxSubArray(int[] nums) {
        int msf=nums[0];
        int med=0;
        for(int i=0;i<nums.length;i++)
        {
            med+=nums[i];
            if(msf<med)
            {
                msf=med;
            }
            if(med<0)
            {
                med=0;
            }
        }
        return msf;
        
    }
}