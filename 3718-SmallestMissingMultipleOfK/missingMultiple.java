class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=k;i<=1000;i+=k){
            if(set.contains(i)==false){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
