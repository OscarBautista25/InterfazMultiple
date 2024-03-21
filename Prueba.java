public class Prueba {
    public static void main(String[] args) {
        Terrestre camioneta =  new Terrestre(250, 40);
        System.out.println("Camioneta");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("Velocidad Actualizada = " +camioneta.velocidadActual);
        camioneta.frenar(400);
        System.out.println("Velocidad Actualizada = " +camioneta.velocidadActual);
        
        Acuatico motoAcuatica = new Acuatico(180, 60);
        System.out.println("Moto Acuatica");
        motoAcuatica.imprimir();
        motoAcuatica.acelerar(50);
        System.out.println("Velocidad Actualizada = " +motoAcuatica.velocidadActual);
        motoAcuatica.frenar(40);
        System.out.println("Velocidad Actualizada = " +motoAcuatica.velocidadActual);
        System.out.println("Revoluciones del Motor = " +motoAcuatica.calcularRevolucionesMotor(1200,10));
        motoAcuatica.recomendarVelocidad(200);
        
    }
}
