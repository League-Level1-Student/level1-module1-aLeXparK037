package _05_vault;

import java.util.Random;

public class vault {
int secretcode;


public vault() {
	Random ran = new Random();
	 secretcode = ran.nextInt(1000000);
		
	}

public boolean tryCode(int code) {
	System.out.println("trying code" + code);
	if (code == secretcode) {
		return true;
	}
		return false;
	
	
	}


}



