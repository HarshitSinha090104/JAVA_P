package Stacks;
import java.util.*;
import java.util.Stack;
public class ValidP{
    public static boolean Valid(String s){
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                list.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(list.isEmpty() || list.pop()!='('){
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(list.isEmpty() || list.pop()!='['){
                    return false;
                }
            }
            else if(s.charAt(i)=='}'){
                if(list.isEmpty() || list.pop()!='{'){
                    return false;
                }
            }
            
        }
        return list.isEmpty();
    }
    public static void main(String[] args) {
        String s="({[]}";
        boolean b=Valid(s);
        System.out.println(b);
    }
}
