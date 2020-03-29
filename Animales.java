/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Animales {
    public static void main(String[] args) {
        
        
 Mamiferos mamiferos=new Mamiferos("tigre","viviparos","pulmonar","leche");
        mamiferos.mostrar();
    

Reptiles reptiles=new Reptiles("cocodrilo","oviparos","sangre fria","carne");
reptiles.mostrar();

Aves aves=new Aves("pajaro","oviparos","plumas","granos");
aves.mostrar();
}
}