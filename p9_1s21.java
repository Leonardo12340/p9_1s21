import java.util.Scanner;

public class p9_1s21{
	public stattic void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System operacion;
		System.out.println("Que tipo de operaciones desea realizar");
		System.out.println("escribala: Suma, Resta");
		operacion = teclado.nextLine()

		if (operacion.equals("Suma")){
			System.out.println("Haremos una suma");
		}else if (operacion.equals("Resta")){
			System.out.println("Haremos una resta");
		}else {
			System.out.println("No existe la operacion")
		}
	}
}