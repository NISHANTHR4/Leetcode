class Solution {//{(a)}
    public boolean isValid(String s) {
       Stack<Character> para=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            para.push(s.charAt(i));
        }
        else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
            if(para.isEmpty()) return false;
            char top=para.pop();
            if((s.charAt(i)==')' && top!='(') ||
            (s.charAt(i)=='}' && top!='{')  ||
             (s.charAt(i)==']' && top!='[')){
                return false;
             }

        }
        else{
            continue;
        }
       }
       return para.isEmpty();
    }
}