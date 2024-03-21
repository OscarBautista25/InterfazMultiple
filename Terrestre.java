public class Terrestre extends Vehiculo implements Motor{

    public Terrestre(int velocidadMaxima, int velocidadActual) {
        super(velocidadMaxima, velocidadActual);
        
    }
    void acelerar(int velocidad){
        int vel = velocidadActual+velocidad;
        if (vel>velocidadMaxima) {
            System.out.println("No puede superar la velocidad màxima permitda");
        } else {
            velocidadActual = vel;
        }
    
    }
    void frenar(int velocidad){
        int vel = velocidadActual-velocidad;
        if (vel<0) {
            System.out.println("La velocidad actual no puede ser menor que 0");
        } else {
            velocidadActual = vel;
        }
    }
    public int calcularRevolucionesMotor(int fuerza, int radio){
        return (fuerza*radio);
    }
    
}
