package carga_y_descarga_valores;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hora {
    public String ConseguirHora(){
        LocalTime hora = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        return hora.format(timeFormatter);
    }
}
