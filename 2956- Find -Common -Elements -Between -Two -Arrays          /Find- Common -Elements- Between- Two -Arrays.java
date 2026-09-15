class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer[]=new int[2];
        int ans1=0;
        int ans2=0;
        HashSet <Integer> set1=new HashSet<>();
        HashSet <Integer> set2=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int num:nums2) set2.add(num);
        for(int num:nums1){
            if(set2.contains(num)){
                ans1++;
            }
        }
        for(int num:nums2){
            if(set1.contains(num)){
                ans2++;
            }
        }
        answer[0]=ans1;
        answer[1]=ans2;
        return answer;
    }
}
