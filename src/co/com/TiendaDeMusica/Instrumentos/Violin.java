package co.com.TiendaDeMusica.Instrumentos;

public class Violin extends Instrumento{

    private String tipoDeViolin;

    public Violin(String nombre, String marca, double precio,
                  String tipoDeViolin) {
        super(nombre, marca, precio);
        this.tipoDeViolin = tipoDeViolin;
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
