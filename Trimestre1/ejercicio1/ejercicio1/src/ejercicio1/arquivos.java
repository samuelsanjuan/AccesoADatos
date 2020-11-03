package ejercicio1;

import java.io.File;
import java.io.IOException;

public class arquivos {
    
    public void eDirectorio(String dir){
    
        File directorio=new File(dir);
        if(directorio.isDirectory()){
        
            System.out.println("e un directorio");
            
        }else {
        
            System.out.println("non e un directorio");
            
        }
        
    }
    
    public void eFicheiro(String fich){
    
        File ficheiro=new File(fich);
        if (ficheiro.isFile()){
        
            System.out.println("e un ficheiro");
            
        }else {
        
            System.out.println("non e un ficheiro");
            
        }
    
    }
    
    public void creaDirectorio(String r){
    
        File ruta=new File(r);
        if (ruta.exists()){
            System.out.println("directorio ya existe");
        }else {
            ruta.mkdirs();
            System.out.println("directorio creado");
        }       
    
    }
    
    public void creaFicheiro(String r, String fileName){
    
        try {
            String rut= r+"/"+fileName;
            File ruta =new File(rut);
            if(!ruta.isFile()){
                ruta.createNewFile();
                System.out.println("fichero creado");
            }else {
                System.out.println("fichero ya existe");
            }
            
        } catch (IOException ex) {
            System.out.println("ha habido un error con la creacion del fichero");
        }
    
    }
    
    public void modoAcceso(String r,String fileName){
    
        String rut= r+"/"+fileName;
        File ruta =new File(rut);
        if(ruta.canRead()){
            System.out.println("lectura si");
        }else{
            System.out.println("lectura no");
        }
        if(ruta.canWrite()){
            System.out.println("escritura si");
        }else{
            System.out.println("escritura non");
        }
    }
    
    public void calculaLonxitude(String r, String fileName){
    
        String rut= r+"/"+fileName;
        File ruta =new File(rut);
        System.out.println(ruta.length());
    
    }
    
    public void mLectura (String r, String fileName){
    
        String rut= r+"/"+fileName;
        File ruta =new File(rut);
        ruta.setReadOnly();
        System.out.println("puesto archivo "+fileName+" solo lectura");
    }
    
    public void mEscritura(String r, String fileName){

        String rut= r+"/"+fileName;
        File ruta =new File(rut);
        ruta.setWritable(true);
        ruta.setReadable(false);
        System.out.println("puesto archivo "+fileName+" solo escritura");
            
    }
    
    public void borraFicheiro(String r,String fileName){
    
        String rut= r+"/"+fileName;
        File ruta =new File(rut);
        if (ruta.exists()){
            ruta.delete();
            System.out.println(fileName +" borrado");
        }else{
            System.out.println("no existe tal fichero");
        }
    }
    
    public void borradirectorio(String r){
        
        File ruta= new File(r);
        if (ruta.exists()){
            ruta.delete();
            System.out.println("directorio borrado");
        }else{
            System.out.println("no existe tal directorio");
        }
    }
    
    public void mContido(String r){
    
        File ruta=new File(r);
        String[]files=ruta.list();
        
        for(int i=0; i<files.length; i++){
            System.out.println(files[i]);
        }
    }
    
    public void recur(File ruta){
    
        File directorio=new File(ruta.getPath());
        String[]files=directorio.list();
        
        for (int i=0 ; i< files.length;i++){
            System.out.println(files[i]);
        }
    
    }
}
