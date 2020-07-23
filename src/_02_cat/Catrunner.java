package _02_cat;

public class Catrunner {
public static void main(String[] args) {
	Cat sandy = new Cat("Sandy");
	sandy.meow();
	sandy.printName();
	for(int i = 0; i < 9; i++)
	sandy.kill();
}
}
