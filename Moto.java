
public class Moto {


	String modelo;
	int qtde;


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public static void incluirMoto(){
		System.out.println("Você entrou no método Inclui Motocicleta.");
	}
	public static void venderMoto(){
		System.out.println("Você entrou no método Vender Motoclicleta.");
	}
	public static void listarVendas(){
		System.out.println("Você entrou no método Listar Vendas de Motoclicleta.");
	}

}	



