package util;

public class CurrencyConverter {
	public double dollar = 3.10;
	public double quantidade = 200;
	public double reais;
	public double IOF = 200*6/100;
	
	
	
	public double converter() {
		this.reais = this.dollar * this.quantidade;
		return reais + this.IOF;
		
		
	}

}
