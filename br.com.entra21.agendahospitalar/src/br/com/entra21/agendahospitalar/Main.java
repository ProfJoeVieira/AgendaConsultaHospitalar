package br.com.entra21.agendahospitalar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner entrada = new Scanner(System.in);
	byte opcao;

	public static void main(String[] args) {
		do {
			System.out.println("|=========| AGENDA HOSPITALAR |=========|");
			System.out.println("-1 : Encerrar programa");
			System.out.println(" 0 : Sair");
			System.out.println(" 2 : Perfil Profissional da Saúde");
			System.out.println(" 3 : Perfil Paciente");
			System.out.println(" 4 ; Sobre o programa");

		} while (capturarOpcaoMenu() != 0);
		System.out.println("Obrigada por usar o programa Agenda Hospitalar! Vejo você por ai...");

	}

	public static byte capturarOpcaoMenu() {
		byte opcao;
		opcao = entrada.nextByte();

		switch (opcao) {
		case -1:
			System.out.println("Saindo...");
			System.exit(-1);
			break;

		case 0:
			System.out.println("Agenda Hospitalar finalizada");
			break;

		case 2:
			System.out.println("O login será implementado futuramente");
			break;

		case 3:
			System.out.println("O cadastro será implementado futuramente");
			break;
			
		case 4: 
			SobreoProjeto.sobreAgendaHospitalar();
		}
		return opcao;
	}

}
