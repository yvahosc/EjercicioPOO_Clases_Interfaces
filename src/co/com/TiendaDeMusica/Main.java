package co.com.TiendaDeMusica;

import co.com.TiendaDeMusica.Instrumentos.Guitarra;
import co.com.TiendaDeMusica.Instrumentos.Instrumento;
import co.com.TiendaDeMusica.Instrumentos.Piano;
import co.com.TiendaDeMusica.Instrumentos.Violin;
import co.com.TiendaDeMusica.Tienda.TiendaDeMusica;

public class Main {

    public static void main(String[] args) {
        //Creando la tienda
        TiendaDeMusica tiendaDeMusica = new TiendaDeMusica();

        //Creando instrumentos
        Instrumento guitarra = new Guitarra("Guitarra eléctrica", "Yamaha",
                2290000, 6);

        Instrumento piano = new Piano("Piano de cola", "Yamaha",
                50000000, 88);

        Instrumento violin = new Violin("Violín acústico", "Yamaha",
                599000, "Sv-200 Silent");

        //Agregando instrumentos a la tienda
        tiendaDeMusica.agregarInstrumento(guitarra);
        tiendaDeMusica.agregarInstrumento(piano);
        tiendaDeMusica.agregarInstrumento(violin);

        //Mostrando instrumentos
        tiendaDeMusica.mostrarInstrumentos();

        //Afinando y tocando instrumentos
        guitarra.afinar();
        guitarra.tocar();
        piano.afinar();
        piano.tocar();
        violin.afinar();
        violin.tocar();

        //Comprando guitarra
        tiendaDeMusica.venderInstrumento(guitarra);

        //Mostrando instrumentos
        tiendaDeMusica.mostrarInstrumentos();
    }
}
