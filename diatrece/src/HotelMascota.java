import java.util.ArrayList;

public class HotelMascota <T, H>{

    private ArrayList<T> lista = new ArrayList<>();
    H direccion;

    public void add(T obj){
        lista.add(obj);
    }

    public ArrayList<T> getLista(){
        return  lista;
    }

    public H getDireccion(){
        return direccion;
    }

}
