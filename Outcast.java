/******************************************************************************
 *  Compilation:  javac Outcast.java
 *  Execution:    java  Outcast
 *  Dependencies: edu.princeton.cs.algs4.*;
 *
 *  @author(s)          Scott McKay
 *  @collaborator(s)    None
 *  @course             Data Structures
 *  @homework           Programming Homework 3: WordNet
 *  @copyright          None
 *  @date_created       Wednesday, November 8th, 2017 @8:26 p.m. MST
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
 *  NOTE: 
 *
 *  % java Outcast
 *
 ******************************************************************************/

import java.io.FileNotFoundException;

//8:26
public class Outcast 
{
    //Outcast should only contain valid WordNet nouns
    public Outcast(WordNet wordnet)
    {
        
    }
    
    //Given an array of WordNet nouns, return an outcast.
    public String outcast(String[] nouns)
    {
        return null;
    }
    
    public static void main(String[] args) throws FileNotFoundException 
    {       
        WordNet wordnet = new WordNet(args[0], args[1]);
        Outcast outcast = new Outcast(wordnet);
        for (int t = 2; t < args.length; t++) 
        {
            In in = new In(args[t]);
            String[] nouns = in.readAllStrings();
            StdOut.println(args[t] + ": " + outcast.outcast(nouns));
        }
    }
}
