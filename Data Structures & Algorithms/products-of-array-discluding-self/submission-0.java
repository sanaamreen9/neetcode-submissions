class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int j;
        int k=0;
        for(int i=0;i<n;i++){
            j=i+1;
            int p=prev(nums,k,i);
            int ni=next(nums,j,i);
            res[i]=p*ni;
        }
        return res;
    }
    public int next(int[] nums,int j,int i){
        int n=nums.length;
        int r=1;
        while(j<n){
            r*=nums[j];
            j++;
        }
        return r;
    }
    public int prev(int[] nums,int k,int i){
        int r2=1;
        while(k<i){
            r2*=nums[k];
            k++;
        }
        return r2;
    }
}  
