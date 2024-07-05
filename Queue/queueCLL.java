package Queue;

public class queueCLL {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static class QueueCC{
        Node head=null;
        Node tail=null;
        int size=0;
        public Boolean isEmpty(){
            return head==null;
        }
        public void add(int data){
            Node temp=new Node(data);
            System.out.println("data entered"+data);
            if(isEmpty()){
                head=tail=temp;
            }
            tail.next=temp;
            tail=temp;
            tail.next=head;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Null");
                return -1;
            }
            return head.data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Null");
                return -1;
            } 
            int x=head.data;
            head=head.next;
            tail.next=head;
            return x;
        }
      

    }
    public static void main(String[] args) {
        QueueCC c=new QueueCC();
        System.out.println(c.isEmpty());
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        System.out.println(c.peek());
        System.out.println(c.remove());
        System.out.println(c.remove());
        c.add(5);
        c.add(6);
        System.out.println(c.remove());
        System.out.println(c.remove());
        System.out.println(c.remove());
        System.out.println(c.remove());
        System.out.println(c.remove());
    }
}
