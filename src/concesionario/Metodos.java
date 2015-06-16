package concesionario;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class Metodos {

    PrintWriter fichero;
    ArrayList<Coche> lista;
    String delim = ",";
    String fichCoche = "/datos/local/dpazolopez/Desktop/5817 - David Pazo Lopez/src/concesionario/fichero.txt";
    String linea;
    int bucle;
    Scanner sc;

    public Metodos() {
    }

    public Metodos(ArrayList<Coche> lista) {
        this.lista = lista;
    }

    public ArrayList<Coche> getlista() {
        return lista;
    }

    public void setListaB(ArrayList<Coche> lista) {
        this.lista = lista;
    }

    public Metodos(ArrayList<Coche> lista, String modelo, float precio) {
    }

    public void añadirCoche(ArrayList<Coche> lista) {
        lista.add(new Coche(this.pedirModelo(), this.pedirPrecio()));
    }

    public void visualizar(Coche coche) {
        JOptionPane.showMessageDialog(null, "Coche: \nModelo: " + coche.getModelo() + "\nPrecio:" + coche.getPrecio());
    }

    public void borrar(ArrayList<Coche> lista) {
        
        lista.remove(lista);
        JOptionPane.showMessageDialog(null, "Lista borrada");
    }

    public String pedirModelo() {
        String modelo;
        modelo = (JOptionPane.showInputDialog("Introducir modelo: "));
        return modelo;
    }

    public float pedirPrecio() {
        float precio = 0;
        do {
            precio = Integer.parseInt(JOptionPane.showInputDialog("Precio del coche:"));
            if (precio <= 0) {
                JOptionPane.showMessageDialog(null, "No valido,Citroen cobra.");
            }
        } while (precio <= 0);
        return precio;
    }

    public void consultar() {
        String modelo;
        float precio;
        try {
            sc = new Scanner(new File(fichCoche)).useDelimiter(delim);
            do {
                int aux = 0;
                lista = new ArrayList();
                while (sc.hasNextLine()) {
                    linea = sc.nextLine();
                    String[] l = linea.split(",");
                    for (int i = 0; i < l.length; i++) {
                        lista.add(new Coche());
                    }
                }

            } while (bucle == 0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
    }
    public void ordenar(){
        
    }
}
