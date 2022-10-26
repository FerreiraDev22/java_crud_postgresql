package helpers;

import java.util.Scanner;

public class ClienteHelper {

	// método para ler o id do cliente
	public static Integer lerIdCliente() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o id do cliente.......: ");
		return Integer.parseInt(scanner.nextLine());
	}

	// método para ler o nome do cliente
	public static String lerNome() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do cliente.....: ");
		return scanner.nextLine();
	}

	// método para ler o email do cliente
	public static String lerEmail() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o email do cliente....: ");
		return scanner.nextLine();
	}

	// método para ler o telefone do cliente
	public static String lerTelefone() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o telefone do cliente.: ");
		return scanner.nextLine();
	}
}