class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        long j=(int)Math.pow(c,0.5)+1;
        while(i<=j)
        {
            if((i*i+j*j)==c) return true;
            else if((i*i+j*j)<c) i++;
            else j--;
        }
        return false;
        
    }
}
