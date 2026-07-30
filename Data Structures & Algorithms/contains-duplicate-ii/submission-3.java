class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        boolean result = false;
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n){
                if(nums[i]==nums[j] && i!=j && Math.abs(i-j)<=k){
                    result=true;
                    j++;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
}