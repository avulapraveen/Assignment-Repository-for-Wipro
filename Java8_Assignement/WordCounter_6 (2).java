package Java8_Assignement;
import java.util.*;

public class WordCounter_6 {

	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Rajesh");
	names.add("Ram");
	names.add("Bheem");
	names.add("Raju");
	names.add("Raj");
	names.add("Senthil");
	
	
	long sorted = names.stream().filter(n->n.length()>5).count();
	System.out.println("Total count is"+ " "+ sorted);
	

	}

}
