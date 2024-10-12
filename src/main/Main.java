package main;

import carga_y_descarga_valores.ListadosJson;
import carga_y_descarga_valores.ValoresTiempoReal;
import monedas.TranscribirCambiosMonedasGson;
import monedas.Monedas;
import solicitudes.OpcionesPrincipales;
import solicitudes.SolicitaMoneda;
import solicitudes.SolicitaPais;
import solicitudes.SolicitaValor;
import carga_y_descarga_valores.Fecha;
import carga_y_descarga_valores.Hora;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean flagDelWhile = false;
        int opcionElegida;
        String monedaOrigen;
        String monedaAConvertir;
        BigDecimal tasaDeCambio;
        BigDecimal valorACambiar;
        BigDecimal valorCambiado;
        List<TranscribirCambiosMonedasGson> cambiosAnteriores;

        OpcionesPrincipales opcionesPrincipales = new OpcionesPrincipales();
        SolicitaPais solicitaPais = new SolicitaPais();
        SolicitaMoneda solicitaMoneda = new SolicitaMoneda();
        SolicitaValor solicitaValor = new SolicitaValor();
        ListadosJson listadosJson = new ListadosJson();
        ValoresTiempoReal valoresTiempoReal = new ValoresTiempoReal();
        Hora hora = new Hora();
        Fecha fecha = new Fecha();

        if (listadosJson.CargarListadosAnteriores()==null)
            cambiosAnteriores = new ArrayList<>();
        else
            cambiosAnteriores = listadosJson.CargarListadosAnteriores();

        System.out.println("""
                
                
                ***********************************************
                
                
                ¡Bienvenido al Sistema Convertidor de Monedas!
                
                
                ***********************************************
                
                
                """);

        while (!flagDelWhile){
            opcionElegida = opcionesPrincipales.SolicitarTipoConversion();

            switch (opcionElegida) {

                case 1:
                    monedaOrigen = solicitaPais.SolicitarPais("pais de la moneda de origen");
                    monedaAConvertir = solicitaPais.SolicitarPais("pais de la moneda a convertir");
                    valorACambiar = solicitaValor.SolicitarValor();
                    tasaDeCambio = valoresTiempoReal.ConseguirTasaDeCambio(monedaOrigen, monedaAConvertir);
                    valorCambiado = valorACambiar.multiply(tasaDeCambio);

                    TranscribirCambiosMonedasGson transcribirCambiosMonedasGson = new TranscribirCambiosMonedasGson(monedaOrigen, valorACambiar, monedaAConvertir, valorCambiado, tasaDeCambio, hora.ConseguirHora(), fecha.ConseguirFecha());
                    System.out.println(transcribirCambiosMonedasGson);
                    cambiosAnteriores.add(transcribirCambiosMonedasGson);
                    break;

                case 2:
                    monedaOrigen = solicitaMoneda.SolicitarMoneda("moneda de origen");
                    monedaAConvertir = solicitaMoneda.SolicitarMoneda("moneda a convertir");
                    valorACambiar = solicitaValor.SolicitarValor();
                    tasaDeCambio = valoresTiempoReal.ConseguirTasaDeCambio(monedaOrigen, monedaAConvertir);
                    valorCambiado = valorACambiar.multiply(tasaDeCambio);

                    TranscribirCambiosMonedasGson transcribirCambiosMonedasGson1 = new TranscribirCambiosMonedasGson(monedaOrigen, valorACambiar, monedaAConvertir, valorCambiado, tasaDeCambio, hora.ConseguirHora(), fecha.ConseguirFecha());
                    System.out.println(transcribirCambiosMonedasGson1);
                    cambiosAnteriores.add(transcribirCambiosMonedasGson1);
                    break;

                case 3:
                    if (cambiosAnteriores.isEmpty()) {
                        System.out.println("¡Todavía no ha hecho ninguna consulta!");
                    } else{
                        for (TranscribirCambiosMonedasGson cambioAnterior : cambiosAnteriores) {
                            System.out.println(cambioAnterior.toString());
                        }
                    }
                    break;

                case 4:
                    for (Monedas moneda : Monedas.values()){
                        System.out.println(moneda.getPais());
                    }
                    break;

                case 5:
                    for (Monedas moneda : Monedas.values()){
                        System.out.println(moneda.getNombreDeLaMoneda());
                    }
                    break;

                case 9:
                    listadosJson.GuardarNuevaConsulta(cambiosAnteriores);
                    System.out.println("""
                            
                            
                            ************************************************
                            
                            
                            ¡Gracias por haber utilizado nuestro programa!
                            
                            ¡Buena semana y hasta pronto!
                            
                            
                            *************************************************
                            
                            
                            """);
                    flagDelWhile = true;
                    break;

                default:
                    System.out.println("¡Opción errónea!\n" +
                            "Por favor elija una de las opciones dadas.");
                    break;
            }
        }
    }
}
