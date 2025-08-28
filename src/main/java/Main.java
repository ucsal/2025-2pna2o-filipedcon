import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {
		DiscountCalculator calc = new DiscountCalculator();
		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}

//Clone o repositório da atividade.
//Abra no IDE (IntelliJ / VS Code / Eclipse).
//Leia o código legado em src/main/java/br/com/mariojp/solid/ocp/.
//Rode os testes (mvn -q test) → eles falham inicialmente.
//Refatore aplicando OCP:
//    Crie uma interface DiscountPolicy que define apply(double amount).
//    Implemente políticas concretas: RegularPolicy, PremiumPolicy, PartnerPolicy.
//    Ajuste DiscountCalculator para receber um mapa de políticas (injeção).
//Garanta que novos tipos possam ser adicionados sem modificar DiscountCalculator.
//Rode novamente os testes até ficarem verdes .
//Faça commits pequenos e dê push no repositório.
