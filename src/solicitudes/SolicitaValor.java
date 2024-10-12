package solicitudes;

import validadores.ValidarCaracterTeclado;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitaValor implements ValidarCaracterTeclado {
    private BigDecimal valorACambiar;
    private Scanner teclado = new Scanner(System.in);
    private boolean flag;

    public BigDecimal SolicitarValor(){
        flag = false;
        while (true) {
            while (!flag){
                System.out.println("Ingrese el importe a cambiar: ");
                flag = ValidarCaracterTeclado();
            }

            if (valorACambiar.doubleValue() < 0.000001) {
                System.out.println("¡El importe a cambiar no puede ser menor a 0,000001!");
            } else {
                break;
            }
        }
        return valorACambiar;
    }

    @Override
    public Boolean ValidarCaracterTeclado() {
        try {
            valorACambiar = teclado.nextBigDecimal();
            return true;
        }catch (InputMismatchException e){
            System.out.println("¡Caracter Inválido!\n " +
                    "Solamente números y decimales separados por ','");
            teclado.next();
        }
        return false;
    }
}
