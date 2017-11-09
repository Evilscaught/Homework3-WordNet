
public class WordNet 
{
    //Constructor takes the name of the two input files.
    public WordNet(String synsets, String hypernyms)
    {
        //Requirements:
        //  Must take linearithmic time to call constructor
    }
    //All WordNet nouns
    public Iterable<String> nouns()
    {
        return null;
    }
    
    //Is the word a WordNet noun
    public boolean isNoun(String word)
    {
        //Requirements:
        //  Must take logarithmic time.
        if (word == null)
        {
            throw new java.lang.NullPointerException("Word cannot be null");
        }

        return false;
    }
    
    //A synset (second field of synsets.txt) that is the shortest common ancestor of noun1 and noun2
    public String sca(String noun1, String noun2) //sca == shortest common ancestor
    {
        //Requirements:
        //  Must make exactly one call to length() and ancestor() methods in ShortestCommonAncestor
        if ((noun1 == null) || (noun2 == null))
        {
            throw new java.lang.NullPointerException("Noun1 or noun2 cannot be null.");
        }
        //If noun1 and noun2 are a WordNet noun, throw an illegal argument exception.
        if (!isNoun(noun1) || !isNoun(noun2))
        {
            throw new java.lang.IllegalArgumentException();
        }
           
        return null;
    }
    
    //Distance between noun1 and noun2
    public int distance(String noun1, String noun2)
    {
        //Requirements:
        //  Must make exactly one call to length() and ancestor() methods in ShortestCommonAncestor
        if ((noun1 == null) || (noun2 == null))
        {
            throw new java.lang.NullPointerException("Noun1 or noun2 cannot be null.");
        }
        //If noun1 and noun2 are a WordNet noun, throw an illegal argument exception.
        if (!isNoun(noun1) || !isNoun(noun2))
        {
            throw new java.lang.IllegalArgumentException();
        }
        
        return 0;
    }
    
    //Unit Testing
    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub

    }
}