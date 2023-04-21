package punto1;
import java.util.Scanner;
public class frase {
	 private static Scanner sc;

	public static void main(String[] args) {
		    sc = new Scanner(System.in);

		    System.out.println("Ingresa una frase: ");
		    String frase = sc.nextLine();

		    char[] caracteres = frase.toCharArray();

		    System.out.println("Los caracteres de la frase son: ");
		    for (int i = 0; i < caracteres.length; i++) {
		      System.out.println(caracteres[i]);
		    }
		  }
		}


