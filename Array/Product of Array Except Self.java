class Solution {
    public int[] productExceptSelf(int[] nums) {
        //method 1;
        int[] l= new int[nums.length];
        int[] r=new int[nums.length];
        int[] mul=new int[nums.length];

        l[0]=1;
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]*nums[i-1];
        }
        r[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            r[i]=r[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            mul[i]=l[i]*r[i];
        }

        // //method 2;
        // int[] l= new int[nums.length];
        // int[] mul=new int[nums.length];
        // l[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     l[i]=l[i-1]*nums[i-1];
        // }
        // int r=1;
        // for(int i=nums.length-1;i>=0;i--){
        //     mul[i]=r*l[i];
        //     r=r*nums[i];
        // }


        return mul;

    }
}
