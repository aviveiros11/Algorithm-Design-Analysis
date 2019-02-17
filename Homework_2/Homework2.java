import java.util.*;
import java.util.Scanner;
public class Homework2 {


   public static void main(String[] args) {
     List<Integer> l[] = new LinkedList[9];
     for(int i=0;i<9;i++){
       l[i] = new LinkedList<>();
     }
     l[1].add(2); l[1].add(3);
     l[2].add(1); l[2].add(3); l[2].add(4); l[2].add(5);
     l[3].add(1); l[3].add(2); l[3].add(5); l[3].add(7); l[3].add(8);
     l[4].add(2); l[4].add(5);
     l[5].add(2); l[5].add(3); l[5].add(4); l[5].add(6);
     l[6].add(5);
     l[7].add(3); l[7].add(8);
     l[8].add(3); l[8].add(7);

     for(int i = 1; i < 9; i++){
       System.out.println(i+"->"+l[i]);
     }

    //Start BFS and get user input
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Vertex from 1-8: ");
    int start = in.nextInt();
    in.close();

    System.out.println("BFS starting from vertex "+start);

    //Make a visted queue of boolean values
    boolean visited[] = new boolean[9];

    //Make a queue for BFS
    LinkedList<Integer> queue = new LinkedList<Integer>();

    // Mark the current node as visited and queue it
    visited[start]=true;
    queue.add(start);
    System.out.print(start+" ");

    while (queue.size() != 0){
        // remove vertex from queue
        start = queue.remove();
        //Loop over the current node and traverse its child nodes
        //if the child nodes haven't been visited mark it true
        Iterator<Integer> i = l[start].listIterator();
        while (i.hasNext()) {
            int next = i.next();
            if (!visited[next]) {
                System.out.print(next+" ");
                visited[next] = true;
                queue.add(next);
            }
        }
    }
  }
}
