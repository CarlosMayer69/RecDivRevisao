package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int div(int dividendo, int divisor) {
		//Condi��o de Parada
		if (dividendo == 0) {//Se chegar a 0, n�o conta mais!
			return 0;
		} else {
			dividendo = dividendo - divisor;
			return 1 + div(dividendo, divisor);//div - Chamada da fun��o!
			//novo dividendo, antigo divisor
		}
	}
}
