// https://leetcode.com/problems/valid-parentheses/

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else {
                if(st.isEmpty() || c!=st.pop()) return false;
            }
        }
        return st.isEmpty();
    }
}