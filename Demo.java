public class Demo{
    public static void removeDuplicates(SuperArray s){

      for (int i = 0; i < s.size(); i++) {

			if (i != s.indexOf(s.get(i))) {
				s.remove(i);
				i--;
			}

    }
    
}
