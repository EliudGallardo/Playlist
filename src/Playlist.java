import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Playlist {
    static ArrayList <String> music = new ArrayList<String>();
    static String res = ""; 
    static int num1 = 0 ;
    
    public static void Bienvenido () {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a tu playlist" + "\n" + "1. Ver Playlist" + "\n" + "2. Agregar Playlist" + "\n" + 
        "3. Actualizar Playlist" + "\n" + "4. Eliminar una Cancion" + "\n" + "5. Eliminar toda la Playlist"));
        switch (num1) {
            case 1:
                Ver();
                break;
            case 2:
                Agregar();
                break;
            case 3:
                Actualizar();
                break;
            case 4:
                EliminarUna();
                break;
            case 5:
                EliminarToda();
            break;
            default:
            Bienvenido();
            break;

        }
    }
    public static void Ver (){
        if(music.size()==0){
        JOptionPane.showMessageDialog(null, "No hay ninguna cancion");
        //music.add("Solo Aqui");
        }else{
        JOptionPane.showMessageDialog(null, music);
        }
    }
    public static void Agregar (){
        music.add(JOptionPane.showInputDialog("Agrega tu cancion"));
    }
    public static void Actualizar (){
        music.set (Integer.parseInt(JOptionPane.showInputDialog(music+"\n Que numero de cancion quieres actualizar"))-1,JOptionPane.showInputDialog("Agrega una cancion"));

    }
    public static void EliminarUna (){
        
        if ("si".equals(JOptionPane.showInputDialog("Seguro que quieres eliminar?"))){
        music.remove(Integer.parseInt(JOptionPane.showInputDialog(music+"\n Que cancion quieres eliminar?"))-1);
        }
    }
    public static void EliminarToda (){
        if ("si".equals(JOptionPane.showInputDialog("Seguro que quieres eliminar toda la Playlist?"))){
        music.clear();
        }
    }
    public static void main(String[] args) {

        do {
            try {
                 Bienvenido();
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (JOptionPane.showConfirmDialog(null, "Quires repetir?", null, 0, JOptionPane.YES_NO_OPTION)==0);
    }
}
    

