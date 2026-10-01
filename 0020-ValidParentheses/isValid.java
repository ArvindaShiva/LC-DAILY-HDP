class Solution {
    public boolean isValid(String s) {
        boolean res = true;
        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < characters.length; i++) {
            if(characters[i] == '{' || characters[i] == '[' || characters[i] == '(') {
                stack.push(characters[i]);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(characters[i] == '}' && top == '{') {
                    res = true;
                }
                else if(characters[i] == ')' && top == '(') {
                    res = true;
                }
                else if(characters[i] == ']' && top == '[') {
                    res = true;
                }
                else {
                    res = false;
                    break;
                }
            }
        }
        return res && stack.isEmpty();
    }
}
