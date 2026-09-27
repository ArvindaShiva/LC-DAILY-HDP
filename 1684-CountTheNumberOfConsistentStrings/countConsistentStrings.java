class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        int count=words.length;
        for(String word:words){
            for(char c:word.toCharArray()){
                if(!set.contains(c)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
