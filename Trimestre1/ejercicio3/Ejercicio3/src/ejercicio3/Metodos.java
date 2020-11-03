package ejercicio3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Metodos {
    BufferedOutputStream imagen2;
    BufferedInputStream imagen1;
    public void copybytestexto(String ruta,String foto1, String foto2){
        try {
           
            imagen2=new BufferedOutputStream(new FileOutputStream(ruta+"/"+foto2,true));
            imagen1=new BufferedInputStream(new FileInputStream(ruta+"/"+foto1));
            int i=32;
            while (i!=-1){
                i=imagen1.read();
                if(i!=-1){
                    imagen2.write(i);
                }else{
                    System.out.println("copiado");
                }
            }
         
            imagen1.close();
            imagen2.close();
                       
            System.out.println("acabe");
            
        } catch (FileNotFoundException ex) {
            System.out.println("no se pudo completar la operacion");
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
}
