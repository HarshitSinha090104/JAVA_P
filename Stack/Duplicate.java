package Stacks;

import java.util.Stack;

public class Duplicate {
    public static boolean Dupli(String s){
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=')'){
                list.push(c);
            }
            else{
                int count=0;
                while(list.peek()!='('){
                    list.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                list.pop();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="(a+b)+(c)";
        boolean b=Dupli(s);
        System.out.println(b);
    }
}
