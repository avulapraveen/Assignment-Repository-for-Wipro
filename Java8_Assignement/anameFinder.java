package Java8_Assignement;

import java.util.*;
import java.util.stream.*;

public class ANameFinder {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
			names.add("Anil");
			names.add("pk");
			names.add("Suresh");
			names.add("Ammai");
			
			List<String> sorted = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
			System.out.println("Names are :" + " "+ sorted);
		
	}

}
