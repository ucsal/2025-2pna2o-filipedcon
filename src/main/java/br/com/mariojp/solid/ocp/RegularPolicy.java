package br.com.mariojp.solid.ocp;

public class RegularPolicy implements DiscountPolicy {
double amount;
	@Override
	public double descontarValor(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.95;
	}
}

//public double apply(double amount, CustomerType type){
//    switch (type){
//        case REGULAR: return amount * 0.95;
//        case PREMIUM: return amount * 0.90;
//        default: return amount;
//    }

//Refatore aplicando OCP:
//Crie uma interface DiscountPolicy que define apply(double amount).
//Implemente políticas concretas: RegularPolicy, PremiumPolicy, PartnerPolicy.
//Ajuste DiscountCalculator para receber um mapa de políticas (injeção).
//Garanta que novos tipos possam ser adicionados sem modificar DiscountCalculator.
//Rode novamente os testes até ficarem verdes .
//Faça commits pequenos e dê push no repositório.