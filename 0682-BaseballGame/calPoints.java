class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String curr=operations[i];
            char first_ch=curr.charAt(0);
            if(first_ch=='C'){
                stack.pop();
            }else if(first_ch=='D'){
                int val=stack.pop();
                stack.push(val);
                stack.push(2*val);
            }else if(first_ch=='+'){
                int val1=stack.pop();
                int val2=stack.pop();
                int sum=val1+val2;
                stack.push(val2);
                stack.push(val1);
                stack.push(sum);
            }else{
                stack.push(Integer.parseInt(curr));
            }
        }
        for(int ele:stack){
            ans+=ele;
        }
        return ans;
    }
}
