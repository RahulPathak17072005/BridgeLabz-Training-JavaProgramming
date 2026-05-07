package Dsa_Basics;
import java.util.*;
public class QueueImplementation {

    static class myQueue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        void enqueue(int x){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        void dequeue(){
            if(s1.isEmpty()){
                return;
            }
            s1.pop();
        }
        int front(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
        int size(){
            return s1.size();
        }
    }
    public static void main(String[] args) {
        myQueue q=new myQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front: " + q.front());
        System.out.println("Size : "+q.size());
        q.dequeue();
        System.out.println("front: " + q.front());
        System.out.println("Size: "+q.size());
        
    }
}