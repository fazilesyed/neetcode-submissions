class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack();
        for(char ch : arr) {
            if(ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            }else {
                if(!st.isEmpty()) {
                    char temp = st.pop();
                    if((ch == '}' && temp != '{') || (ch == ')' && temp != '(') || (ch == ']' && temp != '[')){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        if(!st.isEmpty()) {
            return false;
        }
        return true;
    }
}
