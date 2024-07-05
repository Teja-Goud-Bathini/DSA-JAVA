package Queue;

public class queueLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
        }
    }
    public static class Queuell{
     Node head=null;
   Node tail=null;
     int size=0;
        public  Boolean isEmpty(){
            return size==0;
        }
        public  void display(){
            Node temp=head;
            if(isEmpty()){
                System.out.println("Ques is EMpty");
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;                
               
                
            }
            System.out.println();
        }
        public void add(int data){
            Node temp=new Node(data);
            if(size==0){
                head=tail=temp;
            }
            else{
                System.out.println("My size is"+size);
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("EMpty in peek()");
                return -1;
            }
            return head.data;
        }
        public  int pop(){
            if(isEmpty()){
                System.out.println("EMpty in peek()");
                return -1;
            }
        int x=head.data;
        head=head.next;
        size--;
    
        return x;

        }
    }
    public static void main(String[] args) {
      Queuell q=new Queuell();
      System.out.println(q.isEmpty());
    q.add(1);
    q.add(2);
    q.display();
    System.out.println(q.isEmpty());
    q.add(3);
    q.add(4);
    q.display();
    System.out.println(q.pop());
    q.display();
    System.out.println(q.peek());
    }
}
