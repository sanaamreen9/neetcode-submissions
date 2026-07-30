class Solution {
    public void sortColors(int[] nums) {
      int n=nums.length;
      for(int i=0;i<n;i++){
        int j=i+1;
        while(j<n){
          if(nums[i]>nums[j]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
          }
          else if(nums[i]<nums[j]){
            j++;
          }
          else{
            j++;
          }
        }
      }
      for(int i=0;i<n;i++){
      System.out.println(nums[i]);
      }  
    }
}