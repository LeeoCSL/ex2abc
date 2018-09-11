package ex2a;

import java.util.Scanner;

public class teste {

	static Scanner sc = new Scanner (System.in);
	static double diametro;
	static double diametro1, diametro2;
	static RodaGigante rodaGigante1;
	static RodaGigante rodaGigante2;
	static int rotacoes;
	static int contador = 1;
	public static void main(String[] args) {
		diametro1 = digitarDiametro();
		if(diametro1 < 10 || diametro1 > 40) { 
			System.out.println("valor invalido, digite um valor entre 10 e 40"); 
			digitarDiametro();
	
		}else {
			rodaGigante1 = new RodaGigante(diametro1);
		}

		digitarRotacoes(rodaGigante1);
		digitarCor(rodaGigante1); 
		
		contador = 2;
		diametro2 = digitarDiametro();
		if(diametro2 < 10 || diametro2 > 40) { 
			System.out.println("valor invalido, digite um valor entre 10 e 40"); 
			digitarDiametro();
		}else {
			rodaGigante2 = new RodaGigante(diametro2);
		}

		digitarRotacoes(rodaGigante2);
		digitarCor(rodaGigante2);
		
		System.out.println(rodaGigante1.gira(rodaGigante1));
		System.out.println(rodaGigante2.gira(rodaGigante2));
		
	}
	
	public static double digitarDiametro() {
		System.out.println("Digite o diametro da " + contador + "ª roda gigante.");
		return sc.nextDouble();
		
	}
	
	public static void digitarCor(RodaGigante rodaGigante) {
		System.out.println("Digite a cor da " + contador + "ª roda gigante");
		rodaGigante.setCor(sc.next());
	}
	
	public static void digitarRotacoes(RodaGigante rodaGigante) {
		System.out.println("Digite o numero de rotações da " + contador + "ª roda gigante");
		rotacoes = sc.nextInt();
		if(rotacoes < 4 || rotacoes > 10) {
			System.out.println("O valor de rotação deve ser entre 4 e 10");
			digitarRotacoes(rodaGigante);
		}else {
			rodaGigante.setRotacoes(rotacoes);
		}
	}
	
	
}
