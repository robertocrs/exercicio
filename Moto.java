
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
		System.out.println("Voc� entrou no m�todo Inclui Motocicleta.");
	}
	public static void venderMoto(){
		System.out.println("Voc� entrou no m�todo Vender Motoclicleta.");
	}
	public static void listarVendas(){
		System.out.println("Voc� entrou no m�todo Listar Vendas de Motoclicleta.");
	}

}	



