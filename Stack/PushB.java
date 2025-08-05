package Stacks;
import java.util.*;
public class PushB {
    public static void pushBotttom(Stack<Integer> lis,int item){
        if(lis.isEmpty()){
            lis.push(item);
            return;
        }

        int top=lis.pop();
        pushBotttom(lis, item);
        lis.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        
        pushBotttom(list, 0);
        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();

        }

    }
}
