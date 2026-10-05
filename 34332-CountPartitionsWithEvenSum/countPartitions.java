class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int[] psum=new int[nums.length];
        psum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            psum[i]=psum[i-1]+nums[i];
        }
        int total=psum[nums.length-1];
        for(int j=0;j<psum.length-1;j++){
            int lsum=psum[j];
            int rsum=total-lsum;
            if((lsum-rsum)%2==0) count++;
        }
        return count;
    }
}
