package carga_y_descarga_valores;

import monedas.TranscribirCambiosMonedasGson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

public class ListadosJson {
    private String rutaArchivo = "monedascambiadas.json";
    private String contenido;
    private Type listaJson;
    private List<TranscribirCambiosMonedasGson> listaDeCambiosAnteriores;
    private FileWriter fileWriter;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public List CargarListadosAnteriores(){
        try {
            contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));

            listaJson = new TypeToken<List<TranscribirCambiosMonedasGson>>() {}.getType();

            listaDeCambiosAnteriores = gson.fromJson(contenido, listaJson);

            return listaDeCambiosAnteriores;
        } catch (NoSuchFileException | NullPointerException e){
            System.out.println("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listaDeCambiosAnteriores;
    }

    public void GuardarNuevaConsulta(List cambiosAnteriores) throws IOException {
        fileWriter = new FileWriter("monedascambiadas.json");
        fileWriter.write(gson.toJson(cambiosAnteriores));
        fileWriter.close();
    }
}
