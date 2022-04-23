class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        int l=0;
        int u=Arr.length-1;
        while(l<=u)
        {
            int m=(l+u)/2;
            if(Arr[m]==k) return m;
            else if(Arr[m]<k)
            {
                l=m+1;
            }
            else if(Arr[m]>k) u=m-1;
        }
        return l;
       
    }
