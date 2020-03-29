
public class Reptiles extends Super {
    private String oviparos;
    private String sangreFria;
    private String carne;

    public Reptiles(String animal) {
        super(animal);
    }

public Reptiles(String animal,String oviparos,String sangreFria,String carne){
super(animal);
this.oviparos=oviparos;
this.sangreFria=sangreFria;
this.carne= carne;
}
public void mostrar(){
     System.out.println("animal;" + getAnimal() );
    System.out.println("caracteristica 1:" + oviparos);
      System.out.println("caracteristica2:" + sangreFria);
        System.out.println("comida principal:" + carne);
}
} 

