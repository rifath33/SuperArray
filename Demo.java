import java.io.*;
import java.util.*;

public class Demo{

  public static void removeDuplicates(SuperArray s){
    String[] clone = s.toArray();

    for(int i = 0; i < clone.length; i++){
      for(int f = clone.length-1; f>i; f--){
        if((clone[f]).equals(clone[i]))
        clone[f] = "duplicate";
      }
      //clone = s.toArray()
    }

    for(int i = clone.length-1; i > 0; i--){
      if(clone[i].equals("duplicate"))
      s.remove(i);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    removeDuplicates(a);
    removeDuplicates(b);

    String[] aClone = a.toArray();
    String[] bClone = b.toArray();
    String[] smaller;
    String[] other;
    SuperArray smallerSuper;
    SuperArray otherSuper;

    int termsInCommon = 0;

    int workingLength;

    if(aClone.length < bClone.length)
    {smaller = aClone;
      smallerSuper = a;
      other=bClone;
      otherSuper = b;
    }
    else if ( bClone.length<aClone.length )
    {smaller = bClone;
      smallerSuper = b;
      other=aClone;
    otherSuper = a;}
    else     {smaller = bClone;
          smallerSuper = b;
          other=aClone;
        otherSuper = a;}

    for(int i = 0; i<smaller.length; i++){
      for(int f = 0; f<other.length; f++){
        if(smaller[i].equals(other[f]))
        termsInCommon++;
      }
    }

    SuperArray result = new SuperArray(termsInCommon);
    for(int i = 0; i<smaller.length; i++){
        if(smallerSuper.contains(otherSuper.get(i)))
        result.add(otherSuper.get(i));
    }

    return result;

  }

  public static void main(String[]args){

    SuperArray words = new SuperArray();
//grouped to save vertical space
words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
words.add("una");    words.add("ebi");     words.add("toro");

SuperArray kutha = new SuperArray();
//grouped to save vertical space
kutha.add("kani");   kutha.add("uni");     kutha.add("ebi");     kutha.add("una");
kutha.add("una");    kutha.add("ebi");     kutha.add("kani");    kutha.add("una");
kutha.add("una");    kutha.add("ebi");     kutha.add("toro");

    System.out.println(findOverlap(words,kutha));

  }

}
