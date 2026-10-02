class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        char[] one=s.toCharArray();
        char[] two=t.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<one.length;i++){
            map1.put(one[i],i);
        }
        for(int i=0;i<two.length;i++){
            map2.put(two[i],i);
        }
        for(char key:map1.keySet()){
            sum+=Math.abs(map1.get(key)-map2.get(key));
        }
        return sum;
    }
}
