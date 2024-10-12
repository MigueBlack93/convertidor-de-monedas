package solicitudes;

import validadores.ValidarCaracterTeclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpcionesPrincipales implements ValidarCaracterTeclado {
    private Scanner teclado = new Scanner(System.in);
    private int opcionElegida;
    private boolean flag = false;

    public int SolicitarTipoConversion(){
        flag = false;

        while (!flag) {
            System.out.println("""
                    
                    
                    ******************************************
                    
                    
                    Elija una de las opciones:
                    
                    1.- Cambiar monedas por el nombre de los paises.
                    
                    2.- Cambiar monedas por el nombre de las monedas.
                    
                    3.- Imprimir el historial de conversiones.
                    
                    4.- Imprimir el listado de los paises soportados.
                    
                    5.- Imprimir el listado de las monedas soportadas.
                    
                    9.- SALIR.
                    
                    
                    ******************************************
                    
                    
                    """);

            flag = ValidarCaracterTeclado();
        }
        return opcionElegida;
    }

    @Override
    public Boolean ValidarCaracterTeclado() {
        try{
            opcionElegida = teclado.nextInt();
            return true;
        }catch (InputMismatchException e){
            System.out.println("¡Caracter Inválido!\n" +
                    "¡Debe ingresar un número!");
            teclado.next();
        }
        return false;
    }
}
