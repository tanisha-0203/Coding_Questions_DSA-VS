import java.util.Comparator;
import java.util.PriorityQueue;
public class Priority{
    public static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s1){
            return this.rank-s1.rank;
        }
    }
    public static void main(String args[]){
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(4);
        // pq.add(67);
        // pq.add(73);
        // pq.add(11);

        // // System.out.println(pq.poll());

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }


        PriorityQueue<Student> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A",4));
        pq.add(new Student("B",6));
        pq.add(new Student("C",21));
        pq.add(new Student("D",3));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->"+ pq.peek().rank);
            pq.remove();
        }

    }
}