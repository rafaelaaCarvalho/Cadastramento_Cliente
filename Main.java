package monitoria_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fila_de_Pessoas fdp = new Fila_de_Pessoas();
		
		char selecione;
		do {
		System.out.println("Bem vindo ao nosso cadastramento");
		
		System.out.println("Digite seu nome:");
		
		String nome = sc.next();
		
		System.out.println("Digite sua idade:");
		
		int idade = sc.nextInt();
		
		System.out.println("Digite seu genero:"); 
		
		String genero = sc.next();
		
		System.out.println("Voce tem alguma prioridade?:");
		
		char escolha = sc.next().charAt(0);
		
		
		if(escolha =='s') {
		System.out.println("1 - Pessoa Gestante");
		System.out.println("2 - Pessoa Idosa");
		System.out.println("3 - Pessoa PCD");
		
		int valor = sc.nextInt();
		switch (valor) {
		
		case 1 : Pessoa pg = new Pessoa_Gestante(nome, idade, genero, true);
		
		fdp.Cadastrar(pg);
		break;
		
		case 2: Pessoa pi = new Pessoa_Idosa(nome, idade, genero, true);
		
		fdp.Cadastrar(pi);	
		break;
		
		case 3: Pessoa pc = new Pessoa_PCD(nome, idade, genero, true);
	
		fdp.Cadastrar(pc);
		
		break;
		default:
			
			System.out.println("Voce digitou um numero invalido");
		}
		 
	} else {
		
		Pessoa c = new Pessoa_Comum(nome, idade, genero, false);
		fdp.Cadastrar(c);
	}
		System.out.println("Deseja realizar um novo cadastro? Sim/Nao");
		selecione = sc.next().charAt(0);
		
	
		}while(selecione == 's');
		for (Pessoa p: fdp.filadeprioridade()) {
			System.out.println(p);
			System.out.println(fdp.filacomum());
		}
	} 

}
