
package dades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class fitxer {
    File fitxer,carpeta;
    BufferedWriter escriure;
    BufferedReader llegir;
    
    
    public fitxer() {
        crearCarpeta();
        crearDirectori();
        write();
        read();
    }
    
    private void crearCarpeta(){
        fitxer = new File("dades" + File.separator + "fitxer.txt");
    }
    private void crearDirectori(){
        carpeta = new File("dades");
        if(carpeta.mkdir()){
            System.out.println("Carpeta creada correctament");
        }else{
            System.err.println("error al crear la carpeta");
        }
    }
    private void write(){
        try {
            escriure = new BufferedWriter(new FileWriter(fitxer));
        } catch (IOException ex) {
            Logger.getLogger(fitxer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            escriure.close();
        } catch (IOException ex) {
            Logger.getLogger(fitxer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void read(){
        String cadena;
        try {
            llegir = new BufferedReader(new FileReader(fitxer));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fitxer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while((cadena = llegir.readLine())!=null) {
                System.out.println(cadena);
            } } catch (IOException ex) {
            Logger.getLogger(fitxer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            llegir.close();
        } catch (IOException ex) {
            Logger.getLogger(fitxer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
