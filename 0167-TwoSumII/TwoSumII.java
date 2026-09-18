class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0,end=numbers.length-1;
        int[] array=new int[2];
        while(st<end){
            if(numbers[st]+numbers[end]==target){
                array[0]=st+1;
                array[1]=end+1;
                return array;
            }else if(numbers[st]+numbers[end]<target){
                st++;
            }else{
                end--;
            }
        }
        return array;
    }
}
