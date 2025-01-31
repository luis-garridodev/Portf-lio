package barbeiro;
import java.util.Random;

public class barbeiro implements Runnable{
	private int cadeiradeespera;//define quantas pessoas podem esperar atendimento
	boolean cadeiraocupada=false;//true=ocupada e false=livre
	int[] clientes;//numero aleat�rio de clientes
	boolean barbeirodorme=false;//true=dorme e false=atende
	private String nome;//nome da thread criada
	private int clinovos;//gera random at� numero m�ximo de clientes
	int nclientes=0;//inicializa�ao da variavel total de clientes
	
	//m�todo querecebe os parametros para inicializar o barbeiro
	barbeiro(String nome,int cadeiradeespera,int clientes){
		clinovos=clientes;//inicializa o maximo random de clientes
		this.nome=nome;//recebe o nome do barbeiro
		this.cadeiradeespera=cadeiradeespera;//inicializa o total de cadeiras
		System.out.println("o barbeiro:"+nome+"chegou no salao");
		
	}
	//metodo que gera os clientes aleatoriamente e cria o vetor de clientes
	public void clientes() {
		Random r=new Random();//gera um numero aleat�rio de clientes
		nclientes=r.nextInt(clinovos);//gera o total de clientes randomicos
		clientes=new int[nclientes];//da o tamanho do vetor de clientes
		for(int i=0;nclientes<clientes.length;i++) {
			clientes[i]=i;
		}
		
	}
	public void barbeirodorme() throws InterruptedException{
		System.out.println("n�o exite clientes no sal�o de barbeiro:"+nome+".");
		System.out.println("o barbeiro"+nome+"est� esperando a chegada de clientes");
		Thread.sleep(2000);//como n�o h� clientes a thread espera por 2 segundos
		System.out.println("a cadeira do barbeiro"+nome+"est� livre");
		//chama o m�todo cria clientes
		clientes();
	}
	public void barbeiroatende()throws InterruptedException{
		if(nclientes !=0) {//se h� clientes entra no if
			if(nclientes>1 && cadeiraocupada==false) {//se tem mais de um cliente e a cadeira n�o est� vazia 
			
				
			}
			else {
				System.out.println("existem"+nclientes+"esperando"+nome);
				
			}
			//se h� clientes,1 ja pode ser atendido
			System.out.println("um cliente ocupou a cadeira de barbeiro:"+nome);
			nclientes--;//cliente foi atendido,decrementa o  numero de clientes
			System.out.println("um cliente est� sendo atendido pelo barbeiro:"+nome);
			cadeiraocupada=true;//a cadeira do barbeiro est� ocupada
			//barbeiro atendendo,a thread � maior que o numero de cadeiras de espera
			Thread.sleep(1000);
			//se o numero de clientes � maior que o numero de cadeiras de espera
			if(nclientes>cadeiradeespera) {
				//verifica quantos clientes ir�o embora
				int cli=nclientes-cadeiradeespera;
				//verifica quantos clientes esperam
				nclientes=nclientes-cli;
				//enquanto o contador for menor que o numero de clientes,o vetor � zerado nas posi��es
				for(int i=0;i<clientes.length-1;i++) {
					clientes[i]=0;
				}
				//atualiza o total de clientes
				for(int j=0;j<nclientes;j++) {
					clientes[j]=j+1;
				}
				//mostra quantos clientes foram embora
				System.out.println(cli+"clientes foram embora");
				//mostra quantos clientes ficaram
				System.out.println(nclientes+"clientes esperando");
			}
			//mostra qual barbeiro est� livre
			System.out.println("um cliente ja foi atendido pelo barbeiro:"+nome);
			//se o numero de clientes for igual a 1
			
		}
		else if(nclientes==1) {
			//mostra qual barbeiro est� livre
			System.out.println("a cadeira do barbeiro"+nome+"est� livre");
			//avisa que barbeiro vai atender
			System.out.println("a cadeira do barbeiro "+nome+"est� ocupada,mas logo ele o atender�");
		    Thread.sleep(1000);
		    nclientes--;
		    //mostra qual barbeiro ja atendeu
		    System.out.println("um cliente ja foi atendido por"+nome);
		    
			
		}
		else//avisa qual banheiro est� livre
		{
			System.out.println("a cadeira do barbeiro "+nome+"est� livre");
			
		}
		//libera as cadeiras da espera
		cadeiraocupada=false;
	}
	@Override
	public void run() {
		while(true) {
			if(nclientes<=0)//se n�o tem clientes
				{
				try {
					barbeirodorme();
				}catch(InterruptedException ex) {
					System.out.println(ex);
				}
				
			}
			else {
				try {
					barbeiroatende();//se tem clientes
					
				}catch(InterruptedException ex) {
					System.out.println(ex);
				}
			}
		}
	}

}
