package Java8_Ass;

interface meeting{
	void meet();
	
	default void schedule_meet(){
		System.out.println("Meeting is already Scheduled");
	}
}

public class Default {

	public static void main(String[] args) {
		meeting m=()->System.out.println("Meeting is going on");
		m.meet();
		m.schedule_meet();
	}

}