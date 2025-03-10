package com.example.demo.practice;

import java.util.Stack;

public class TestBracketsBal {
    public static void main(String[] args) {
        //Given a String  S="[{(})[]" , find out whether it contains valid paranthesis or not
        // Push character onto stack
        // If ending bracket found , pop it
        // Peek and see if corresponding starting bracket found , If found pop starting bracket also
        // If starting bracket not found then result is false and break
        String string="[{(})[]";
        //String string="[{}()[]]";
        boolean result = true;
        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<charArray.length;i++){
            stack.push(charArray[i]);
            if(charArray[i] == ')'){
                stack.pop();
                if(stack.peek() != '('){
                    result = false;
                    break;
                }else{
                    stack.pop();
                }
            }
            if(charArray[i] == '}'){
              stack.pop();
              if(stack.peek() != '{'){
                  result = false;
                  break;
              }else{
                  stack.pop();
              }
            }
            if(charArray[i] == ']'){
                stack.pop();
                if(stack.peek() != '['){
                    result = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty())
            result = false;

        System.out.println(result);
    }
}
