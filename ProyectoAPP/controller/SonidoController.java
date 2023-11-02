/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollodeinterfaces.ProyectoAPP.controller;

import desarrollodeinterfaces.ProyectoAPP.modelo.Sonido;

/**
 *
 * @author joses
 */
public class SonidoController {
    
    static Sonido s = new Sonido();
    
    
    public static void playMusic(int i){
        s.setFile(i);
        s.play();
        s.loop();
    }
    
    public static void stopMusic(){
        s.stop();
    }
    
    public static void playSE(int i){
        s.setFile(i);
        s.play();
    
    }
    
}
