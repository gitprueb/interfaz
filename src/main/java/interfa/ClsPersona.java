
package interfa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class ClsPersona implements Lpersona {

    @Override
    public String getNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenar_informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cargar_información(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar_información(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static void leerArchivo(){
           File archivo = new File("C:\\Users\\ericf\\OneDrive\\Documentos\\interfaz\\tarea.txt");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            
            int NoLinea=1;
            while (lectura != null){
                
                System.out.println("Linea:"+NoLinea+"  Lectura:"+lectura);
                lectura = entrada.readLine();
                NoLinea++; 
            }
            
            entrada.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
        }
    }
    
     static void escritura() {
          Scanner objeto= new Scanner (System.in);
        String nombre;
         try
        {
            String file = "C:\\Users\\ericf\\OneDrive\\Documentos\\interfaz\\tarea.txt";
            System.out.println("ingrese un texto");
               nombre=objeto.nextLine( );
            String lineToAppend = nombre;    
            byte[] byteArr = lineToAppend.getBytes();
            Files.write(Paths.get(file), byteArr, StandardOpenOption.APPEND);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args){
        
        escritura();
            leerArchivo();
            
    }
    
}
