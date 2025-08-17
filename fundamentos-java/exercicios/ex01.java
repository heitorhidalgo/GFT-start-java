//escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "olá fulano" 
//você tem "X" anos de idade

package exercicios;
 
import java.time.Year;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		int anoBase = Year.now().getValue();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o seu nome: ");
		String nome = sc.next();
		System.out.println("informe o seu ano de nascimento: ");
		int ano = sc.nextInt();
		int idade = anoBase - ano;
		System.out.printf("Ola %s voce tem %s anos \n", nome, idade);
		
		sc.close();
	}

}