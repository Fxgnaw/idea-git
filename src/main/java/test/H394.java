package test;

import java.util.Stack;

public class H394 {

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        int num = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                stack.push(builder.toString());
                integers.push(num);
                num = 0;
                builder = new StringBuilder();
            } else if (s.charAt(i) == ']') {
                int a = integers.pop();
                StringBuilder b = new StringBuilder();
                for (int j = 0; j < a; j++) {
                    b.append(builder);
                }
                builder = new StringBuilder(stack.pop() + b);
            }else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
