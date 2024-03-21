public class Acuatico extends Vehiculo implements Vela,Motor{

    public Acuatico(int velocidadMaxima, int velocidadActual) {
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

    public void recomendarVelocidad(int velocidadViento){
        if (velocidadViento>80 || velocidadViento<10) {
            System.out.println("No se puede salir a navegar");
        } else {
            System.out.println("Se puede salir a navegar");
        }
    }

    
}
