package barbeiro;

public class main {
public static void main(String[]args) {
	barbeiro barbeiro1=new barbeiro("joao",2,5);//nome do barbeiro,cadeiras de espera e máximo de clientes
	Thread threadbarbeiro1=new Thread(barbeiro1);
	threadbarbeiro1.start();
}
}
