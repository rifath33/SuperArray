public class Demo{

    public static void removeDuplicates(SuperArray s){

      for (int i = 0; i < s.size(); i++) {

			if (i != s.indexOf(s.get(i))) {
				s.remove(i);
				i--;
			}

      }
    }

  	public static SuperArray findOverlap(SuperArray a, SuperArray b) {
  		SuperArray result = new SuperArray(Math.min(a.size(), b.size()));
  		for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
  			if (a.size() > i && b.contains(a.get(i)) && !result.contains(a.get(i)))
        result.add(a.get(i));
  			if (b.size() > i && a.contains(b.get(i)) && !result.contains(b.get(i)))
        result.add(b.get(i));
  		}
  		return result;
  	}

    public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("9");
    words.add("1");
    words.add("2");
    words.add("2");
    words.add("3");
    words.add("4");

    SuperArray rifath = new SuperArray();
    rifath.add("0");
    rifath.add("4");
    rifath.add("2");
    rifath.add("2");
    rifath.add("9");

    System.out.println(findOverlap(rifath,words).toString());

    }

}
