package org.example;



import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String archivoEntrada = "pokemon.json";

        List<Pokemon> listaPokemon = cargarPokemons(archivoEntrada);

        if (listaPokemon == null || listaPokemon.isEmpty()) {
            System.out.println("Error: No se han podido cargar los datos.");
            return;
        }

        System.out.println("Se han cargado " + listaPokemon.size() + " Pokémon correctamente.");
    }

    private static List<Pokemon> cargarPokemons(String rutaArchivo) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(rutaArchivo), new TypeReference<List<Pokemon>>(){});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


