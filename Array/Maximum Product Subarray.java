class Solution {
    public int maxProduct(int[] nums) {
        int ans=0;
        if(nums.length==1){
            return nums[0];
        }

        int currProduct=1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                currProduct=currProduct*nums[i];
                ans=Math.max(ans,currProduct);
            }
            else{
                currProduct=1;
            }
        }

        currProduct=1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                currProduct=currProduct*nums[i];
                ans=Math.max(ans,currProduct);
            }
            else{
                currProduct=1;
            }
        }
        return ans;
    }
}
