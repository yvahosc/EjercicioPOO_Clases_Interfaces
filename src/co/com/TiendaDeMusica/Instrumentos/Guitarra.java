package co.com.TiendaDeMusica.Instrumentos;

public class Guitarra extends Instrumento{

    private int numeroDeCuerdas;

    public Guitarra(String nombre, String marca, double precio, int numeroDeCuerdas) {
        super(nombre, marca, precio);
        this.numeroDeCuerdas = numeroDeCuerdas;
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
