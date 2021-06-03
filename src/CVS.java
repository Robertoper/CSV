import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CVS {
    public static void main(String[] args) throws IOException {

        FileReader archivo = new FileReader("/home/administrador/Escritorio/CSV/Pokemons.csv");
        BufferedReader lector = new BufferedReader(archivo);
        Scanner teclado = new Scanner(System.in);
        String linea;
        String [] valores;

        System.out.print("¿Qué tipo de Pokemon buscamos?: ");
        String entrada = teclado.next();

        while ((linea = lector.readLine()) != null) {
            valores = linea.split(",");
            if (valores[2].equals(entrada))
                System.out.println("De tipo " + entrada + " tenemos a " + valores[1]);
            linea = lector.readLine();
        }
        if (lector != null)
            lector.close();
        archivo.close();
    }
}


