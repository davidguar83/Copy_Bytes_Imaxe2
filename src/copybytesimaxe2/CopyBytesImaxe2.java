/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytesimaxe2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class CopyBytesImaxe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contador = 0;

        try {

            BufferedInputStream ler = new BufferedInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/foto.jpg"));
            BufferedOutputStream escribir = new BufferedOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/foto2.jpg"));

           // int c = 0;
          //  while (c != -1) {
             //   c = ler.read();

                escribir.write(ler.readAllBytes());
                contador++;
          //  }
            ler.close();

            escribir.close();
        } catch (IOException e) {
            System.out.println("Hubo un error con un archivo");

        }

        System.out.println(contador + " Bytes");
    }

}
