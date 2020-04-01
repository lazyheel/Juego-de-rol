/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.*;
import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class ManejoDatos {
   
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   Scanner s = new Scanner(System.in);
   
   
   public  String insetarTexto() throws IOException{
       String readLine = in.readLine();
       return readLine; 
    }
    void insertarInt(){
        s.nextInt();
        
    }
}

