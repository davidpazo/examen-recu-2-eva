package concesionario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dpazolopez
 */
public class Fichero {
   
    Scanner scanner;
    String nomFich = "src/concesionario/fichero.txt";
    String limitador = ",";
    String linea;
    int bucle;

    public void leerCoches(ArrayList<Coche> lista) {
        
        try {
            scanner = new Scanner(new File(nomFich)).useDelimiter(limitador);
            while (scanner.hasNextLine()) {
                linea = scanner.nextLine();
                String[] li = linea.split(",");
                for (int i = 0; i < li.length; i += 4) {
                    lista.add(new Coche());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            scanner.close();
        }
    }

}
