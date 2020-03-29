/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Aves  extends Super{
    private String oviparos;
    private String plumas;
    private String granos;
s
    public Aves(String animal) {
        super(animal);
    }

public Aves(String animal,String oviparos,String plumas,String granos){
super(animal);
this.oviparos=oviparos;
this.plumas= plumas;
this.granos=granos;
}
public void mostrar(){
     System.out.println("animal;" + getAnimal() );
    System.out.println("caracteristica 1:" + oviparos);
      System.out.println("caracteristica2:" + plumas);
        System.out.println("comida principal:" + granos);
}
}




