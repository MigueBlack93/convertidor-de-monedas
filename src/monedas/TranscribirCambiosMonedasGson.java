package monedas;

import java.math.BigDecimal;

public record TranscribirCambiosMonedasGson(String moneda_origen,
                                            BigDecimal valor_origen,
                                            String moneda_a_convertir,
                                            BigDecimal valor_convertido,
                                            BigDecimal tasaDeCambio,
                                            String hora,
                                            String fecha) {
    @Override
    public String toString() {
        return "\nEl importe de " + valor_origen() + " "  + moneda_origen() +
                " da el equivalente a "+ valor_convertido() + " " + moneda_a_convertir() +
                ".\nLa tasa de cambio es de " + tasaDeCambio() + " " + moneda_a_convertir() + " a 1 " + moneda_origen() +
                ".\nSe consultó a las " + hora() + " el día " + fecha() + "\n";
    }
}
