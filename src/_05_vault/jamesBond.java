package _05_vault;

public class jamesBond {
	String name;
	public jamesBond (String name) {
	this.name = name;
	
	
	}
	public void findCode(vault v) {
		for (int i = 0; i < 1000000; i++) {
	
		if (v.tryCode(i) == true) {
			
			System.out.println(this.name + "opened the vault");
			return;
			
		}
		}
	}
	
}
