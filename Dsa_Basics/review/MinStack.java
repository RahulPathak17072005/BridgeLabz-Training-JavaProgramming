package Dsa_Basics.review;

public class MinStack {
class Node{
    int data;
    Node next;

Node(int data){
    this.data=data;
}
}
Node top=null;
void push(int data){
    Node newNode=new Node(data);
    if(top==null){
        top=newNode;
        return;
    }
    top.next=newNode;
    newNode=top;
}
void pop(){
    if(top==null){
       System.out.println("Stack UnderFlow") ;
    }
    top=top.next;
}
void top(){
    if(top==null){
       System.out.println("0");;
    }
    top=top.next;
    System.out.print(top.data);
}
public int getMin(int data){
  // while(top!=null){
     // if(top())
     //   System.out.println(top.data);
   // }
   // top=top.next;
   return top.data;
}
public static void main(String[] args) {
    MinStack minStack=new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.top();
    minStack.push(2);
    minStack.pop();
}

    
}