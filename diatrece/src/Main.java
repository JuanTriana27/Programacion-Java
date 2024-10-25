// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        HotelMascota<Gato, String> hotelDeGatos = new HotelMascota<>();
        HotelMascota<Perro, String> hotelDePerros = new HotelMascota<>();

        hotelDeGatos.add(new Gato("lucho"));
        hotelDeGatos.add(new Gato("pepe"));

        hotelDePerros.add(new Perro("Boby", "Grandanes"));
        hotelDePerros.add(new Perro("Lucas", "Poodel toy"));



    }
}