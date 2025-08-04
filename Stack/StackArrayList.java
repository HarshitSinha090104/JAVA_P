package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackArrayList {
    
    public class stackk{
       static ArrayList<Integer> stack=new ArrayList<>();
    public static boolean isEmpty(){
           return stack.size()==0;
    }
    public static void push(int data){
        
        stack.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Empty");
             return 0;
        }
        int top=stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
        
    }
    public  static void peek(){
        if(isEmpty()){
            System.out.println("empty");
              return;
        }
        System.out.println(stack.get(stack.size()-1));
    }
}
public static void main(String[] args) {
   
    stackk.push(1);
    stackk.push(2);
     stackk.push(3);
    while(! stackk.isEmpty()){
         stackk.peek();
           stackk.pop();
    }

}
}
