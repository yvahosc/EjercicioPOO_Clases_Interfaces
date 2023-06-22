package co.com.TiendaDeMusica.Tienda;

import co.com.TiendaDeMusica.Instrumentos.Instrumento;
import java.util.ArrayList;

public class TiendaDeMusica {
    private ArrayList<Instrumento> instrumentos;

    public TiendaDeMusica(){
        instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
        System.out.println("El instrumento: |" + instrumento.toString() + "| " +
                "ha sido ingresado a la tienda.");
    }

    public void mostrarInstrumentos(){
        System.out.println("\nLista de instrumentos en tienda:");
        for (int i = 0; i < instrumentos.size(); i++) {
            System.out.println(instrumentos.get(i).toString());
        }
        System.out.println();
    }

    public void venderInstrumento(Instrumento instrumento){
        if(instrumentos.remove(instrumento)) {
            System.out.println("\nEl instrumento: |" + instrumento.toString() +
                    "| ha sido vendido.");
        } else{
            System.out.println("El instrumento: |" + instrumento.toString() +
                    "| no existe en la tienda.");
        }
    }
}
