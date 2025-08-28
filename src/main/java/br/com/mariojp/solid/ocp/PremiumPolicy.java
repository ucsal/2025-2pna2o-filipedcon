package br.com.mariojp.solid.ocp;

public class PremiumPolicy implements DiscountPolicy {
double amount;
	@Override
	public double descontarValor(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.90;
	}
}
