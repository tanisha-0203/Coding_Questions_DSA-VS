import java.util.PriorityQueue;
public class Priority{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(67);
        pq.add(73);
        pq.add(11);

        System.out.println(pq);
    }
}