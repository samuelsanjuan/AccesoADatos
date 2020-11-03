package ejercicio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Metodos {
    
    FileInputStream texto1;
    FileOutputStream texto2;
    public void copybytestexto(String ruta,String txt1, String txt2){
        try {
            texto1=new FileInputStream(ruta+"/"+txt1);
            texto2=new FileOutputStream(ruta+"/"+txt2,true);
            
            int i=32;
            while (i!=-1){
                i=texto1.read();
                if(i!=-1){
                    texto2.write(i);
                }else{
                    System.out.println("copiado");
                }
            }
         
            texto1.close();
            texto2.close();
                       
            System.out.println("acabe");
            
        } catch (FileNotFoundException ex) {
            System.out.println("no se pudo completar la operacion");
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);            
        }       
    }
}
