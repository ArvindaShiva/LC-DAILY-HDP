class Solution {
    public int minRotations(String s) {
        int score=0;
        int start=0,end=1;
        char[] ch=s.toCharArray();
        int ini=Character.getNumericValue(ch[0]);
        score=Math.min(10-ini,ini);
        while(end<ch.length){
            int st=Character.getNumericValue(ch[start]);
            int en=Character.getNumericValue(ch[end]);
            int sc=Math.min(10-Math.abs(st-en),Math.abs(st-en));
            score+=sc;
            start++;
            end++;
        }
        return score;
    }
}
