import java.util.*;

public class QueueReverseExample
    {
        static Stack<Integer> st = new Stack<>();
        static Queue<Integer> q = new LinkedList<>();
        static int k = 3;

        public static void main(String args[])
        {
            for (int i=1;i<=10;i++)
            {
                q.add(i);
            }
            queuerev();
            while (!q.isEmpty())
            {
                System.out.print(q.poll() + " ");
            }
        }
        public static void queuerev()
        {
            for (int i=0;i<k;i++)
            {
                st.push(q.poll());
            }
            while (!st.isEmpty())
            {
                q.add(st.pop());
            }
            for (int i=0;i<=6;i++)
            {
                q.add(q.poll());
            }
        }
    }