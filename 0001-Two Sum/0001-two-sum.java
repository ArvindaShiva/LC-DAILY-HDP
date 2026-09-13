class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansarray=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                ansarray[0]=map.get(complement);
                ansarray[1]=i;
            }
            map.put(nums[i],i);
        }
        return ansarray;
    }
}
