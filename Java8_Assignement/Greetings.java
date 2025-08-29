package Java8_Assignement;

@FunctionalInterface
interface Greeting
{
	void greet();
	
}

public class Greetings {

	public static void main(String[] args) {
     
		
		Greeting g= ()->System.out.println("good Mrng");
		g.greet();
	}

}
