/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.File;

/**
 *
 * @author oracle
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    
        arquivos metodos=new arquivos();
        
//1
        metodos.creaDirectorio
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        
//2
        metodos.creaFicheiro
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir","Products1" );
        
//3
        metodos.creaDirectorio
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        
        metodos.creaFicheiro
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir","Products2" );
        
//4     
        metodos.mContido
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        
//5
        metodos.modoAcceso
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir", "Products1");
        
        metodos.calculaLonxitude
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir", "Products1");
        
//6
        metodos.mLectura
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir", "Products1");
        
//7
        metodos.mEscritura
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir", "Products1");
        
        
//10
        File file =new File
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        metodos.recur(file);
        
        
//8
        metodos.borraFicheiro
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir", "Products1");
        
//9
        metodos.borradirectorio
        ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        
        
        
    }
    
}
