package co.com.TiendaDeMusica.Instrumentos;

public class Piano extends Instrumento{
    private int numeroDeTeclas;

    public Piano(String nombre, String marca, double precio,
               int numeroDeTeclas) {
        super(nombre, marca, precio);
        this.numeroDeTeclas = numeroDeTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el instrumento: " + this.getNombre() + ".");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el instrumento: " + this.getNombre() +
                ".");
    }
}
