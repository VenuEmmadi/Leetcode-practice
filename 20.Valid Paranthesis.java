class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<>();
        char top;
        for(int i=0; i < stk.size(); i++)
        {
            top = stk.peek();
                 if(top == '(' && s.charAt(i) == ')') stk.pop(); 
            else if(top == '[' && s.charAt(i) == ']') stk.pop(); 
            else if(top == '{' && s.charAt(i)== '}') stk.pop();
            else stk.push(s.charAt(i));
        }
        top = stk.peek();
       return !(stk.isEmpty());
    
    }
        
}
