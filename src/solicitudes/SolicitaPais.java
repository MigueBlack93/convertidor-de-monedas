package solicitudes;

import monedas.Monedas;
import validadores.ValidarSiExiste;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class SolicitaPais implements ValidarSiExiste {
    private String pais;
    private String acronimoDeLaMoneda;
    private Scanner teclado = new Scanner(System.in);
    private boolean existe = false;

    public String SolicitarPais(String numeroPais) {
        existe = false;

        while (!existe) {
            System.out.println("Ingrese el nombre del "+ numeroPais + ":");
            pais = teclado.nextLine();

            ValidarSiExiste();

            if (existe == false) {
                System.out.println("¡No existe o no tenemos el cambio del país ingresado!");
            }
        }
        return acronimoDeLaMoneda;
    }

    @Override
    public Boolean ValidarSiExiste() {
        existe = false;

        Collator collator = Collator.getInstance(new Locale("es", "ES"));
        collator.setStrength(Collator.PRIMARY);

        for (Monedas moneda : Monedas.values()) {
            if (collator.compare(moneda.getPais(), pais) == 0) {
                existe = true;
                acronimoDeLaMoneda = moneda.getAcronimo();
                break;
            }
        }
        return existe;
    }
}
