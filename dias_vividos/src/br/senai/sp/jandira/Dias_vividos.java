package br.senai.sp.jandira;

import java.util.Scanner;

public class Dias_vividos {
	
	
	public class IdadeEmDIas{
	public static void main(String[] args) {
		
	int anos;
		int idadeEmDias;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos:");
		anos = leitor.nextInt();
		
		idadeEmDias = anos * 365;
		System.out.println("Dias vividos = " + idadeEmDias);
	}

}
}

