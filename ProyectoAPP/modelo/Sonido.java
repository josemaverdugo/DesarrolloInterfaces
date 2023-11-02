
package desarrollodeinterfaces.ProyectoAPP.modelo;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author joses
 */
public class Sonido {
    
    
    Clip clip;
    URL soundURL[] = new URL[30];
    
    public Sonido(){
        soundURL[0] =getClass().getResource("sonido\\OpeningPokemon.wav");
        soundURL[1] =getClass().getResource("sonido\\audioMoltres.wav");
        soundURL[2] =getClass().getResource("sonido\\audioCharizard.wav");
        soundURL[3] =getClass().getResource("sonido\\audioGroudon.wav");
        soundURL[4] =getClass().getResource("sonido\\audioCyndaquil.wav");
        soundURL[5] =getClass().getResource("sonido\\audioMagcargo.wav");
        soundURL[6] =getClass().getResource("sonido\\audioBlaziken.wav");
        soundURL[7] =getClass().getResource("sonido\\audioCelebi.wav");
        soundURL[8] =getClass().getResource("sonido\\audioSerperior.wav");
        soundURL[9] =getClass().getResource("sonido\\audioSudowoodo.wav");
        soundURL[10] =getClass().getResource("sonido\\audioSceptile.wav");
        soundURL[11] =getClass().getResource("sonido\\audioBulbasaur.wav");
        soundURL[12] =getClass().getResource("sonido\\audioTorterra.wav");
        soundURL[13] =getClass().getResource("sonido\\audioChandelure.wav");
        soundURL[14] =getClass().getResource("sonido\\audioDrifblim.wav");
        soundURL[15] =getClass().getResource("sonido\\audioBanette.wav");
        soundURL[16] =getClass().getResource("sonido\\audioGengar.wav");
        soundURL[17] =getClass().getResource("sonido\\audioRotom.wav");
        soundURL[18] =getClass().getResource("sonido\\audioPelipper.wav");
        soundURL[19] =getClass().getResource("sonido\\audioLugia.wav");
        soundURL[20] =getClass().getResource("sonido\\audioLapras.wav");
        soundURL[21] =getClass().getResource("sonido\\audioPalafin.wav");
        soundURL[22] =getClass().getResource("sonido\\audioSquirtle.wav");
        soundURL[23] =getClass().getResource("sonido\\audioGreninja.wav");
        
        
        
        
     
}
    
    public void setFile(int i){
        try {
            AudioInputStream s= AudioSystem.getAudioInputStream(soundURL[i]);
            clip=AudioSystem.getClip();
            clip.open(s);
        } catch (Exception e) {
        }
        
    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
    
} 

