/******************************************************************************
 *  Compilation:  javac ShortestCommonAncestor.java
 *  Execution:    java  ShortestCommonAncestor
 *  Dependencies: edu.princeton.cs.algs4.*;
 *
 *  @author(s)          Scott McKay
 *  @collaborator(s)    None 
 *  @course             Data Structures
 *  @homework           Programming Homework 3: WordNet
 *  @copyright          None
 *  @date_created       Tuesday, November 7th, 2017 @3:52 p.m. MST
 *
 *     Interface for acyclic tree of words.  
 *
 *     *
 *
 *     *
 *
 *     *
 *
 *  BUG:
 *
 *  FEATURE:
 *
 *  NOTE: Must send acyclic directional graph file into argument.
 *
 *  % java ShortestCommonAncestor
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.BreadthFirstDirectedPaths;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.DirectedCycle;
import edu.princeton.cs.algs4.In;


public class ShortestCommonAncestor
{
    private Digraph digraph;
    //Constructor takes a rooted DAG as argument
    public ShortestCommonAncestor(Digraph G)
    {
        DirectedCycle acyclic = new DirectedCycle(G);
        if (G == null)
        {
            throw new java.lang.NullPointerException("Di-Graph cannot be Null");
        }
        //Throw an index out of bounds exception if directional graph has a cycle. 
        if (acyclic.hasCycle())
        {
            throw new java.lang.IndexOutOfBoundsException("Di-Graph cannot be cyclic");
        }
        digraph = G;
    }
    
    //Length of shortest ancestral path between v and w.
    public int length(int v, int w)
    {
        //Throw an index out of bounds exception if vertex v or w are not valid vertices. 
        if (!isVertex(v))
        {
            throw new java.lang.IndexOutOfBoundsException("Vertex v is not a valid vertex.");
        }
        if (!isVertex(w))
        {
            throw new java.lang.IndexOutOfBoundsException("Vertex w is not a valid vertex");
        }
        //sca is an abbreviation for: 'shortest common ancestor'
        int sca = 0;
        int length = 0;
        
        BreadthFirstDirectedPaths bfs_path_v = new BreadthFirstDirectedPaths(digraph, v);
        BreadthFirstDirectedPaths bfs_path_w = new BreadthFirstDirectedPaths(digraph, w);
        
        //Requirements:
        //  Must take time proportional to the number of vertices and edges reachable from the argument of vertices
        for (int currentVertex = 0; currentVertex < digraph.V(); currentVertex++)
        {
           if (bfs_path_v.hasPathTo(currentVertex) && bfs_path_w.hasPathTo(currentVertex))
           {
               sca = currentVertex;
           }    
        }
        
        length = bfs_path_v.distTo(sca) + bfs_path_w.distTo(sca);
        
        return length;
    }
    
    //A shortest common ancestor of vertices v and w.
    public int ancestor(int v, int w)
    {
        //Throw an index out of bounds exception if vertex v or w are not valid vertices. 
        if (!isVertex(v))
        {
            throw new java.lang.IndexOutOfBoundsException("Vertex v is not a valid vertex.");
        }
        if (!isVertex(w))
        {
            throw new java.lang.IndexOutOfBoundsException("Vertex w is not a valid vertex");
        }
        //sca is an abbreviation for: 'shortest common ancestor'
        int sca = 0;
        
        BreadthFirstDirectedPaths bfs_path_v = new BreadthFirstDirectedPaths(digraph, v);
        BreadthFirstDirectedPaths bfs_path_w = new BreadthFirstDirectedPaths(digraph, w);

        //Requirements:
        //  Must take time proportional to the number of vertices and edges reachable from the argument of vertices
        for (int currentVertex = 0; currentVertex < digraph.V(); currentVertex++)
        {
           if (bfs_path_v.hasPathTo(currentVertex) && bfs_path_w.hasPathTo(currentVertex))
           {
               sca = currentVertex;
           }    
        }

        return sca;
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
        
        int sca = 0;
        int length = 0;
        
        BreadthFirstDirectedPaths bfs_path_subsetA = new BreadthFirstDirectedPaths(digraph, subsetA);
        BreadthFirstDirectedPaths bfs_path_subsetB = new BreadthFirstDirectedPaths(digraph, subsetB);
        
        for (int currentVertex = 0; currentVertex < digraph.V(); currentVertex++)
        {
           if (bfs_path_subsetA.hasPathTo(currentVertex) && bfs_path_subsetB.hasPathTo(currentVertex))
           {
               sca = currentVertex;
           }    
        }
        
        length = bfs_path_subsetA.distTo(sca) + bfs_path_subsetB.distTo(sca);
        
        return length;
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
    
    //Returns true if given vertex exists in the directional graph.
    public boolean isVertex(int vertex)
    {
        if ((vertex < 0) || (vertex > digraph.V()))
        {
            return false;
        }
        else
        {
            return true; 
        }
    }
    
    //Unit Testing
    public static void main(String[] args) 
    {
        System.out.println("ShortestCommonAncestor.java");
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
        System.out.println("Terminated");
    }
}