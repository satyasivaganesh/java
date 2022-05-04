class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int c=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                c++;
                i++;
                j--;
                
            }
            else if((nums[i]+nums[j])>k)
                j--;
            else
                i++;
            
        }
        return c;
        
        
    }
}
