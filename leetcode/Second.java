import java.util.Stack;

class Second {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                 return false;

                char top = st.pop();
                if (ch == ')' && top != '(') 
                 return false;
                else  if (ch == ']' && top != '[') 
                return false;
                else if (ch == '}' && top != '{')
                return false;
            }
        }

        return st.isEmpty();
    }
      
        public static void main(String[] args) {
            String testString = "{[()]}";
            System.out.println("Is valid: " + isValid(testString));
        }
    }

