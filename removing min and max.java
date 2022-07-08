class Solution {
    public int minimumDeletions(int[] nums) {
        ArrayList<Integer>v=new ArrayList<>();
       int mi=nums[0];
        int ma=nums[0];
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            if( nums[i]<mi)
            {
                mi=nums[i];
                a=i;
            }
            if(nums[i]>ma)
            {
                ma=nums[i];
                b=i;
            }
        }
        v.add(Math.max(a,b)+1);
        v.add(nums.length-Math.min(a,b));
        v.add(a+1+nums.length-b);
        v.add(b+1+nums.length-a);
        int l=v.get(0);
        for(int i=1;i<4;i++)
        {
            if(v.get(i)<l)
                l=v.get(i);
        }
        return l;
        
    }
}
