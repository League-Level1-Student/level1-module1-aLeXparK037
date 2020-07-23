package _04_popcorn;

public class popcornrunner {
public static void main(String[] args) {
	Microwave mic = new Microwave();
	Popcorn pop = new Popcorn("chocolate");
	mic.putInMicrowave(pop);
	mic.setTime(5);
	mic.startMicrowave();
	pop.eat();
	
}
}
