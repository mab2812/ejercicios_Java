import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que quiere pasar a euros");
        double conv = scanner.nextDouble();

        System.out.println(conv);

        double cantidadEuro = 4423; 
        double euros = conv / cantidadEuro;

        System.out.println("La cantidad de euros es: " + euros );

        scanner.close();
    }
}
