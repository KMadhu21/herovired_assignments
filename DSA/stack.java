import java.util.*;
class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String in=sc.next();
            Stack<Character> stack=new Stack<>();
           for(char c : in.toCharArray()){
            if(!stack.isEmpty()){
                switch(c)
                {
                    case ')':
                        if( stack.peek() == '(' )
                        {
                            stack.pop();
                        }
                        break;
                    case '}':
                        if( stack.peek() == '{' )
                        {
                            stack.pop();

                        }
                        break;
                    case ']':
                        if( stack.peek() == '[' )
                        {
                            stack.pop();

                        }
                        break;
                    default:
                       stack.push(c);


                }

            }else{
                stack.push(c);
            }
        }
        System.out.println(stack.isEmpty());

    }
    sc.close();
    }
}