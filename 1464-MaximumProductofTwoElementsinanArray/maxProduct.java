class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            heap.add(nums[i]);
        }
        int ref1=heap.poll();
        int ref2=heap.poll();
        return (ref1-1)*(ref2-1);
    }
}
