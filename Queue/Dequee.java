package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dequee {
   public static void main(String[] args) {
    Deque<Integer>d=new LinkedList<>();
    d.addFirst(1);
    d.addFirst(2);
    d.add(3);
    d.remove();
    d.remove();
    System.out.println(d);

   }

   
}
