package Ejercicio;

public class Ejercicio {
    //atributos
    private int edad;
    private String Nombre;
    //constructores
    public Ejercicio(){//constructor por defecto    
    }
    public Ejercicio(String Nombre, int edad){//sobrecarga de constructor 2
        this.Nombre=Nombre;
        this.edad=edad;
        
    }
    //metodos, setter (establecer) y getter (llamar)
    public void setedad(int edad){
        this.edad=edad;
    }
    public int getedad(){
        return edad;
    }
    //establecesco getter para nombre
    public String getNombre(){
        return Nombre;
        
    }
    public void setNombre(String Nombre){
        this.Nombre= Nombre;
    }
    
    }
    

