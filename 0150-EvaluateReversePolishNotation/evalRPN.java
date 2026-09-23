class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            char first_ch=curr.charAt(0);
            if(first_ch=='+'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }else if(first_ch=='-' && curr.length()==1){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            }else if(first_ch=='*'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }else if(first_ch=='/'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }else{
                stack.push(Integer.parseInt(curr));
            }
        }
        return stack.pop();
    }
}
