import edu.princeton.cs.algs4.Digraph;


public class ShortestCommonAncestor
{
    //Constructor takes a rooted DAG as argument
    public ShortestCommonAncestor(Digraph G)
    {
        if (G == null)
        {
            throw new java.lang.NullPointerException();
        }
      //TODO: Throw a java.lang.IndexOutOfBoundsException if the di-graph G is not a DAG (Directed Acyclic Graph)
    
    }
    
    //Length of shortest ancestral path between v and w.
    public int length(int v, int w)
    {
        //TODO: Throw a java.lang.IndexOutOfBoundsException if v or w are invalid vertices.
        
        //Requirements:
        //  Must take time proportional to the number of vertices and edges reachable from the argument of vertices
        return 0;
    }
    
    //A shortest common ancestor of vertices v and w.
    public int ancestor(int v, int w)
    {
        //TODO: Throw a java.lang.IndexOutOfBoundsException if v or w are invalid vertices.
        
      //Requirements:
        //  Must take time proportional to the number of vertices and edges reachable from the argument of vertices
        return 0;
    }
    
    //Length of shortest ancestral path of vertex subsets A and B
    public int length(Iterable<Integer> subsetA, Iterable<Integer> subsetB)
    {
        if ((subsetA == null) || (subsetB == null))
        {
            throw new java.lang.IllegalArgumentException("SubsetA or SubsetB cannot be null");
        }
        if ( ( !(subsetA.iterator().hasNext() ) ) )
        {
            throw new java.lang.IllegalArgumentException("subsetA has no vertices");
        }
        if ( ( !(subsetB.iterator().hasNext() ) ) )
        {
            throw new java.lang.IllegalArgumentException("subsetB has no vertices");
        }
        
        return 0;
    }
    
    //A shortest common ancestor of vertex subsets A and B
    public int ancestor(Iterable<Integer> subsetA, Iterable<Integer> subsetB)
    {
        if ((subsetA == null) || (subsetB == null))
        {
            throw new java.lang.IllegalArgumentException("SubsetA or SubsetB cannot be null");
        }
        
        return 0;
    }
    
    //Unit Testing
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        In in = new In(args[0]);
        Digraph G = new Digraph(in);
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