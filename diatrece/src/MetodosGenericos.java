import java.util.ArrayList;

public class MetodosGenericos {

    static Integer [] enteros = new Integer [] {9, 8, 7, 6, 5};
    static Float [] decimales = new Float[] {9.0f, 8.0f, 7.0f, 6.0f, 5.0f};
    static Double [] dobles = new Double[] {9.0, 8.0, 7.0, 6.0, 5.0};


    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = convertToArrayGeneric(enteros, "Hola");
        ArrayList<Float> listaFloat = convertToArrayGeneric(decimales, "Hola");
        ArrayList<Double> listaDobles = convertToArrayGeneric(dobles, "Hola");

        System.out.println("listaEnteros.get(0).getClass().getName() = " + listaEnteros.get(0).getClass().getName());
        System.out.println("listaFloat.get(0).getClass().getName() = " + listaFloat.get(0).getClass().getName());
        System.out.println("listaDobles.get(0).getClass().getName() = " + listaDobles.get(0).getClass().getName());
    }

    public static <T, H> ArrayList<T> convertToArrayGeneric(T [] array, H otroDato){
        ArrayList<T> lista = new ArrayList<>();

        for ( T numero: array){
            lista.add(numero);
        }

        System.out.println("otroDato = " + otroDato);

        return lista;
    }

    //Para Integers
    public static ArrayList<Integer> convertToArrayList(Integer [] array){
        ArrayList<Integer> lista = new ArrayList<>();

        for (Integer numero: array) {
            lista.add(numero);
        }

        return lista;
    }

    //Para Float's
    public static ArrayList<Float> convertToArrayList(Float [] array){
        ArrayList<Float> lista = new ArrayList<>();

        for (Float numero: array) {
            lista.add(numero);
        }

        return lista;
    }

    //Para Doubles
    public static ArrayList<Double> convertToArrayList(Double [] array){
        ArrayList<Double> lista = new ArrayList<>();

        for (Double numero: array) {
            lista.add(numero);
        }

        return lista;
    }


}
