package com.coding.test.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParantheses {

    private final Map<Character, Character> mappings;

    ValidParantheses() {
        mappings = new HashMap<>(3);
        mappings.put('}', '{');
        mappings.put(']', '[');
        mappings.put(')', '(');
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if(mappings.containsKey(c)) {
                char topElement = stack.pop();
                if(topElement != mappings.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParantheses validParantheses = new ValidParantheses();
        System.out.println(validParantheses.isValid("{[]}"));
    }
}
