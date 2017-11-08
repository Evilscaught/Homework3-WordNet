import edu.princeton.cs.algs4.Digraph;


public class ShortestCommonAncestor
{
    //Constructor takes a rooted DAG as argument
    public ShortestCommonAncestor(Digraph G)
    {
        
    }
    
    //Length of shortest ancestral path between v and w.
    public int length(int v, int w)
    {
        return 0;
    }
    
    //A shortest common ancestor of vertices v and w.
    public int ancestor(int v, int w)
    {
        return 0;
    }
    
    //Length of shortest ancestral path of vertex subsets A and B
    public int length(Iterable<Integer> subsetA, Iterable<Integer> subsetB)
    {
        return 0;
    }
    
    //A shortest common ancestor of vertex subsets A and B
    public int ancestor(Iterable<Integer> subsetA, Iterable<Integer> subsetB)
    {
        return 0;
    }
    
    //Unit Testing
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        In in = new In(args[0]);
        Digraph G = new Digraph(0); //FIXME
        ShortestCommonAncestor sca = new ShortestCommonAncestor(G);
        while (!StdIn.isEmpty()) 
        {
            int v = StdIn.readInt();
            int w = StdIn.readInt();
            int length   = sca.length(v, w);
            int ancestor = sca.ancestor(v, w);
            StdOut.printf("length = %d, ancestor = %d\n", length, ancestor);
        }
    }
}