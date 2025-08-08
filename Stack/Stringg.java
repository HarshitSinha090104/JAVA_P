package Stacks;
import java.util.*;
public class Stringg {
    public static  String reverseString(String s){
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            list.push(s.charAt(i));
        }
        String s1="";
        while(!list.isEmpty()){
            s1+=list.pop();
        }
        return s1;

    }
    public static void main(String[] args) {
        String s="ABCD";
        System.out.println(reverseString(s));


    }
}
