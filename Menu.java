import java.util.Scanner;

public class Menu {

	private Scanner teclado = new Scanner(System.in);

	public int getOpcao() {
		System.out.println("====Digite a Opção====");
		System.out.println("(0) Sair: ");
		System.out.println("(1) Cadastro Motocicleta; ");
		System.out.println("(2) Cadastro Cliente: ");
		System.out.println("(3) Venda: ");
		System.out.println("(4) Lista Vendas: ");
		return teclado.nextInt();
	}
}
