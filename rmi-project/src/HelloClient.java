import java.rmi.registry.*;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			// Procura o registro do RMI no Servidor
			// Se o servidor estiver em outro host basta substituir pelo seu IP
			Registry registry = LocateRegistry.getRegistry("localhost");

			// Procura a stub do servidor
			Hello stub= (Hello) registry.lookup("Servidor");
			
			System.out.println("Digite o numero a:");
			int a= sc.nextInt();
			
			System.out.println("Digite o numero b:");
			int b= sc.nextInt();
						
			// Chama o método do servidor e imprime a mensagem
			System.out.println("Invocando metodo do servidor");
			int msg = stub.soma(a, b);
			System.out.println("A soma é: " + msg); 
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}