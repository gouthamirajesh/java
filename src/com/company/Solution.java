package com.company;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isValidExpression("[{}]"));//true
        System.out.println(isValidExpression("(({{[}}))"));//false
    }
   //stack = [ '[','{'] ->  ['[']
   // ch = ']'
   // pop = '{'

    private static boolean isValidExpression(String str) {
        //Validations
        if(str == null || str.trim().length()==0){
            throw new RuntimeException("Invalid expression");
        }
        //creating stack
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //Push if char is opening brace
            if(isOpeningBrace(ch)){
                stack.push(ch);
            }
            if(isClosingBrace(ch)){
                 //check for stack is empty //ex:[]]
                if(stack.isEmpty()){
                    return false;
                }
                char popOpenBrace = stack.pop();
                if(ch == '}' && popOpenBrace!='{' ||
                        ch== ']' && popOpenBrace != '[' ||
                        ch == ')' && popOpenBrace != '('
                ){
                    return false;
                }
            }

        }
        //Finally stack should be empty if exp is balanced
        return stack.isEmpty();
    }

    private static boolean isOpeningBrace(char ch) {
        return ch == '(' ||  ch == '{' || ch == '[';
    }

    private static boolean isClosingBrace(char ch) {
        return ch == '}' ||  ch == ']' || ch == ')';
    }


}
