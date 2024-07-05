import java.util.LinkedList;
import java.util.Queue;

public class Queueswap {
     static Queue<Integer> q=new LinkedList<>();

    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();
    public static  void sep()
    {
        int n=q.size();
        int m=n/2;

        for(int i=0;i<n;i++)
        {
            if(i<m)
            {
                q1.offer(q.poll());

            }
            else
            {
                q2.offer(q.poll());
            }
        }
    }
    public static void join()
    {
        int n= q1.size()+q2.size();
        while (!q1.isEmpty())
        {
            q.offer(q1.poll());
            q.offer(q2.poll());
        }
        if(n%2!=0)
        {
            q.offer(q2.poll());
        }
    }
    public static void disp()
    {
        while (!q.isEmpty())
        {
            System.out.println(q.poll()+" ");
        }
    }
    public static void main(String[] args)
    {
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        sep();
        join();
        disp();

    }
}
