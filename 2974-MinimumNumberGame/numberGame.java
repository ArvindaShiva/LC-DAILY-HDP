class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int[] arr=new int[nums.length];
        int ind=0;
        for(int num:nums){
            heap.add(num);
        }
        while(!heap.isEmpty()){
            int a=heap.poll();
            int b=heap.poll();
            arr[ind]=b;
            ind++;
            arr[ind]=a;
            ind++;
        }
        return arr;
    }
}
