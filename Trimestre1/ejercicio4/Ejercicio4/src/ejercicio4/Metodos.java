package ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodos {
    DataOutputStream texto2;
    DataInputStream texto1;
    
    public void copybytestexto(String ruta,String foto1, String foto2){
        try {
           
            texto2=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(ruta+"/"+foto2,true)));
            texto1=new DataInputStream(new BufferedInputStream(new FileInputStream(ruta+"/"+foto1)));
            
            
            for(int i=0;i>3;i++){
            
            while (texto1.available()!=0){
                
                texto2.writeUTF("o tempo esta xelido");
                System.out.println(texto2.size());
                
            }
            texto1.readUTF();
                
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


    
    

