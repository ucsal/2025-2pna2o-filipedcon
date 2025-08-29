package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {

public double apply(double amount);

}

//Refatore aplicando OCP:
//Crie uma interface DiscountPolicy que define apply(double amount).
//Implemente políticas concretas: RegularPolicy, PremiumPolicy, PartnerPolicy.
//Ajuste DiscountCalculator para receber um mapa de políticas (injeção).
//Garanta que novos tipos possam ser adicionados sem modificar DiscountCalculator.
//Rode novamente os testes até ficarem verdes .
//Faça commits pequenos e dê push no repositório.