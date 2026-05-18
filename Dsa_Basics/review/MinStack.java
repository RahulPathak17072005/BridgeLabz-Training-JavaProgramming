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
    newNode.next=top;
    top=newNode;
}
int  pop(){
    if(top==null){
       System.out.println("Stack UnderFlow") ;
       return-1;
    }
    int popped=top.data;
    top=top.next;
    return popped;
}
int top(){
    if(top==null){
       System.out.println("Empty");
       return -1;
    }
   return top.data;
}
public int getMin(){
  if(top==null){
    System.out.println("Empty stack");
    return -1;
  }
  int min= top.data;
  Node temp=top;
  while(temp!=null){
    if(temp.data<min){
        min=temp.data;
    }
    temp=temp.next;
  }
  return min;

}
public static void main(String[] args) {
    MinStack minStack=new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.top();
    minStack.push(2);
    minStack.pop();
    System.out.println("Min element"+ minStack.getMin());
    minStack.push(-8);
    System.out.println("Min element"+ minStack.getMin());
}

    
}