package concesionario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Coche> lista= new ArrayList();
        lista.add(new Coche("citroen saxo",1500));
        lista.add(new Coche("citroen c2",2000));
        lista.add(new Coche("citroen c3",3000));
        lista.add(new Coche("citroen c4",3500));
        lista.add(new Coche("citroen c5",4000));
        lista.add(new Coche("citroen c4 picasso",6000));
        Metodos obj = new Metodos();
        Fichero ob = new Fichero();
        int opc;
        do {
            opc = JOptionPane.showOptionDialog(
                    null, "MENU", "Coche?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                        "Engadir coche",
                        "Borrar coche",
                        "Consultar",
                        "Visualizar",
                        "Leer fichero",
                        "Salir"},
                    "Exit") + 1;

            switch (opc) {
                case 1:
                    obj.añadirCoche(lista);
                    break;
                case 2:
                    obj.borrar(lista);
                    break;
                case 3:
                    obj.consultar();
                    break;
                case 4:
                   for (Coche coche : lista) {
                    obj.visualizar(coche);
                    }
                    break;
                case 5:
                    ob.leerCoches(lista);
                case 6:
                    System.exit(0);
            }
        } while (opc != 0 && opc != 6);
    }
        
}
