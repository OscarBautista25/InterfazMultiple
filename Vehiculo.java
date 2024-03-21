public abstract class Vehiculo {
    int velocidadMaxima;
    int velocidadActual;
    public Vehiculo(int velocidadMaxima, int velocidadActual) {
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }
    void imprimir(){
        System.out.println("Velocidad actual = "+velocidadActual);
        System.out.println("Velocidad Máxima = " +velocidadMaxima);
    }
    abstract void acelerar(int velocidad);
    abstract void frenar(int velocidad);
    

    
}