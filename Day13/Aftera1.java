package Day13;
import java.util.*;


public class Aftera1 {

	public static void main(String[] args) {
		 ArrayList<String> arraylist = new ArrayList<String>();
		  arraylist.add("AA");
		   arraylist.add("ZZ");
		   arraylist.add("CC");
		   arraylist.add("FF");

		   
		   System.out.println("Before Sorting:");
		   for(String str: arraylist){
				System.out.println(str);
			}

		   		   Collections.sort(arraylist, Collections.reverseOrder());

		  
		   System.out.println("ArrayList in descending order:");
		   for(String str: arraylist){
				System.out.println(str);
			}
		
	}

}
