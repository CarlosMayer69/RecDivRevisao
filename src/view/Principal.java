package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		
		int dividendo = 15;
		int divisor = 5;
		int div = dc.div(dividendo, divisor);
		System.out.println(div);
	}

}
