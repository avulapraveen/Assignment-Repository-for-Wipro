package Java8_Assignement;
import java.util.*;


public class ParallelSquare{

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(5);
		num.add(8);
		num.add(9);
		num.add(11);
		
		num.parallelStream()	
		.forEachOrdered(n->System.out.println("Squares of Number" + " " +n+" is :" + (n*n)));
		
		

	}

}