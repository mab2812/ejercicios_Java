import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad que quiere pasar de euros a pesetes");
        double Euros = scanner.nextDouble();

        System.out.println(Euros);

        double pesetes = 166.386; 
        double cantidadPesetes = (Euros*pesetes);

        System.out.println("La cantidad de pesetes es: " + cantidadPesetes );

        scanner.close();
    }
}
