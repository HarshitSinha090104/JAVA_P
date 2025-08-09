package Stacks;
import java.util.*;
public class ReverseStack {
    public static void pushBotttom(Stack<Integer> lis,int item){
        if(lis.isEmpty()){
            lis.push(item);
            return;
        }

        int top=lis.pop();
        pushBotttom(lis, item);
        lis.push(top);
    }
   public static void Reverse(Stack<Integer> s){
    if(s.isEmpty()){
        return;
    }
    int top=s.pop();
    Reverse(s);
    pushBotttom(s, top);
            
   }
   public static void printStack(Stack<Integer>s){
    while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
         }
   }
    public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
         Stack<Integer> temp = (Stack<Integer>) list.clone();
        printStack(temp);
        Reverse(list);
        printStack(list);
    }
}
