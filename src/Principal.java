import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal_atual, novo_sal, aumento; 
		int porcentagem;
		
		aumento = 0;
		novo_sal = 0;
		sal_atual = 0;
		porcentagem = 0;
		
		System.out.print("Digite o salário da pessoa: ");
		sal_atual = sc.nextDouble();
		
	
		if(sal_atual <= 1000) {
			porcentagem = 20;
			aumento = sal_atual * porcentagem / 100;
			novo_sal = sal_atual + aumento;

		}
		
		else if(sal_atual <= 3000) {
			porcentagem = 15;
			aumento = sal_atual * porcentagem / 100;
			novo_sal = sal_atual + aumento;

		}
		
		else if(sal_atual <= 8000.0) {
			porcentagem = 5;
			aumento = sal_atual * porcentagem / 100;
			novo_sal = sal_atual + aumento;

		}
		
		else {
			porcentagem = 5;
			aumento = sal_atual * porcentagem / 100;
			novo_sal = sal_atual + aumento;
		}
		
		System.out.println();
		System.out.printf("Novo Salário: R$ %.2f\n", novo_sal);
		System.out.printf("Aumento: R$ %.2f\n", aumento);		
		System.out.printf("Porcentagem: %d %%\n", porcentagem);
		System.out.println();
		System.out.println("Parabéns pelo aumento, você merece!");
		
		
		sc.close();

	}

}
