import java.util.Stack;

public class Main {
    static boolean solution(String s) {
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
    public static void main(String[] args){
        String s = "((())())";
        boolean result = solution(s);
        System.out.println(result);
    }
}

