package br.com.mariojp.solid.ocp;
public enum CustomerType { REGULAR(0.95), PREMIUM(0.90), PARTNER(0.88); 
	
	protected double tax;
	
	CustomerType(double tax){
		this.tax = tax;
	}
}
