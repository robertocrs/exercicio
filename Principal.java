import java.util.Scanner;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		Menu menu = new Menu();
		Cliente[] cliente= new Cliente[3];
		Moto[] moto = new Moto[3];
		Scanner teclado= new Scanner(System.in);
		
		int opc;
		do {
		System.out.println(menu.getOpcao());

			opc = menu.getOpcao();
		
			switch (opc) {

			case 1: 
				Moto.incluirMoto();

				for(int i =0; i<moto.length; i++) {
					moto[i]  = new Moto();
					System.out.println("Digite o nome da motocicleta: ");
					moto[i].modelo = teclado.next();
					System.out.println("Digite a quantidade ");
					moto[i].qtde=teclado.nextInt();
				}
				break;

			case 2:

				Cliente.incluirCliente();		   

				for(int i =0; i<cliente.length; i++) {
					cliente[i]  = new Cliente();
					System.out.println("Digite o nome do cliente: ");
					cliente[i].nome = teclado.next();
				}
				break;

			case 3:
				Moto.venderMoto();

				Venda[] venda = new Venda[3];
				Moto[] moto1 = new Moto[3];
				Cliente[] cliente1 = new Cliente[3];
				Date date = new Date();

				for(int i =0; i<venda.length; i++) {
					venda[i]  = new Venda();
					System.out.println("Digite o nome do cliente: ");
					venda[i].nome = teclado.next();

					for(int j=0; j<venda.length; j++) {

						if(venda[i].nome == cliente1[j].nome &&										 		
								venda[i].modelo == venda[j].modelo && 
								moto1[i].qtde > 0)
						{
							venda[i].nome = cliente1[j].nome;
							moto1[i].qtde=moto1[i].qtde-1;
							venda[i].nome=venda[j].nome;
							venda[i].data=date.toString();				
						}
						else {System.out.println("nome encontrado porém "
								+ "modelo de motocicleta não encontrado ou "
								+ "quantidade insuficiente para venda");
						}
						{ System.out.println("Cliente não cadastrado");
						}					
					}							
				}
				break;

			case 4:
				Moto.listarVendas();

				Venda[] venda1 = new Venda[3];
				for(int i =0; i<venda1.length; i++) {
					System.out.println(
							"Cliente: " + venda1[i].nome +
							"Modelo Motocicleta: " + venda1[i].modelo +
							"Data da venda: " + venda1[i].data
							);
				}
				break;

			default: 
				System.out.println("Opção inválida");
			}

			while(opc != 0);
			
			System.exit(opc);
		}
		teclado.close();
	}
}










