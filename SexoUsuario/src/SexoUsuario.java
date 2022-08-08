import java.util.Scanner;

public class SexoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu sexo");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'F') {
            System.out.println("O sexo e valido");
        }
        else {
            System.out.println("Sexo invalido");
        }
    }
}
