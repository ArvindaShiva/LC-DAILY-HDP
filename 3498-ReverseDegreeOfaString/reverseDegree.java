class Solution {
    public int reverseDegree(String s) {
        String str="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,26-(ch-'a'));
        }
        int ans=0,ind=1;
        for(char c:s.toCharArray()){
            ans+=(map.get(c)*ind);
            ind++;
        }
        return ans;
    }
}
