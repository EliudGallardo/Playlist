
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList <String> corridos = new ArrayList<String>();
        corridos.add("no se");
        System.out.println(corridos);
        corridos.add("Una pieza que no se baila");
        System.out.println(corridos); 
        System.out.println(corridos.get(1));
        System.out.println(corridos.size());
        corridos.remove(0);
        System.out.println(corridos.get(0));
        //System.out.println(corridos.remove(0));
        corridos.add("el que queria una cancion");
        corridos.add("Se fue la luz");
        corridos.add("Las que no tienen papa");
        System.out.println(corridos);
        corridos.set(2, "Alma enamorada");
        System.out.println(corridos);
        corridos.clear();
        System.out.println(corridos);
    }
}
