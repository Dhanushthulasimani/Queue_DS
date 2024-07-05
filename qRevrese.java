import ReversestackusinglinkedlistDS.ReverSTACK;

import java.time.format.SignStyle;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class qRevrese {
    static Stack<Integer> s=new Stack<>();
    static Queue<Integer> q=new LinkedList<>();
    public static void pushh()
    {
       while(!q.isEmpty())
       {
           s.push(q.poll());
       }
       while (!s.isEmpty())
       {
           q.offer(s.pop());
       }

    }


    public static void main(String[] args)
    {
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
pushh();
        System.out.println(q);

    }
}
