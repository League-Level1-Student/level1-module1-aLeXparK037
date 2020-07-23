package _03_harry_potter;

public class harrypotterrunner {
public static void main(String[] args) {
	HarryPotter harry = new HarryPotter();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	harry.makeInvisible(true);
	harry.spyOnSnape();
	harry.makeInvisible(false);
	harry.castSpell("Stupefy");
}
}
