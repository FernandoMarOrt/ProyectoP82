/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author tania
 */
public class prueba {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ventanaInicio vi = new ventanaInicio();

        // Posición de la ventana
        vi.setLocationRelativeTo(null);
        // La ventana no se puede redimensionar
        vi.setResizable(false);
        //hacemos la ventana visible
        vi.setVisible(true);
    }
}
