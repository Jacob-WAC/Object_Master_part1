package objectmaster;

public class HumanTest {
public static void main(String[] args) {
	Human ralph = new Human();
	Human will = new Human();
	
	
	ralph.attack(will);
	ralph.attack(will);
	System.out.println(will.getHealth());
}
}
