import java.util.Stack;

public class Main {
        boolean solution(String s) {
            boolean answer = true;

            Stack<Parentheses> parentheses = new Stack<>();

            for (char c : s.toCharArray()){
                if (c=='('){
                    parentheses.push(new Parentheses(c));
                }
                else if(c==')'){
                    if (parentheses.isEmpty() || parentheses.pop().getSen() != '(') {
                        return false;
                    }
                }
            }
            if (parentheses.isEmpty()){
                answer = true;
            }
            else{
                answer = false;
            }
            return answer;
        }
    }

