import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.println("Este programa l� dados");
		System.out.print("Por favor, digite seu nome ");
		nome = leitor.next();
		System.out.println("Que legal ter voc� aqui, " + nome);	
		
		leitor.close();
	}
	

}
