s


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Mamiferos extends Super {
    private String viviparos;
    private String pulmonar;
    private String leche;

    public Mamiferos(String animal) {
        super(animal);
    }

public Mamiferos(String animal,String viviparos,String pulmonar,String leche){
super(animal);
this.viviparos=viviparos;
this.pulmonar=pulmonar;
this.leche= leche;
  
}
    
public void mostrar(){
     System.out.println("animal;" + getAnimal() );
    System.out.println("caracteristica 1:" + viviparos);
      System.out.println("caracteristica2:" + pulmonar);
        System.out.println("comida principal:" +leche);
} 
        
    }


