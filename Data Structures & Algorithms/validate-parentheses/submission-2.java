class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(valid_opening(c))
            s1.push(c);
            else
            {
                if(s1.isEmpty())
                    return false;
                else if(c=='}' && s1.peek()=='{')
                    s1.pop();
                else if(c==']' && s1.peek()=='[')
                    s1.pop();
                else if(c==')' && s1.peek()=='(')
                    s1.pop();
                else
                    return false;
            }
            
        }
        if(s1.isEmpty())
        return true;
        else 
        return false;
        
    }
    private boolean valid_opening(char c)
    {
        if(c=='(' || c=='{' || c=='[')
        return true;
        else
        return false;
    }
}
