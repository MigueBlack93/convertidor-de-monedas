package carga_y_descarga_valores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    public String ConseguirFecha(){
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(dateFormatter);
    }
}
