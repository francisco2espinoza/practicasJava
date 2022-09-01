import java.util.LinkedList;

public class Sesion5ListasB {
    public static void main(String[] args) {
        int[] notasProgramacion = {14, 18, 16, 20};
        int[] notasEstructura = {15, 17, 10, 19};
        String[] nombreEstudiantes = {"Raul", "Martin", "Jose", "Maria"};
    }
    public static int alumnoNotaAlta(LinkedList notasProgramacion, LinkedList nombreEstudiantes){
       String respuesta = "null";
       int nota = 0;
       int alumnoMayor = 0;
       for (int i=0; i<notasProgramacion.size(); i++){
           if ((int)notasProgramacion.get(i) > nota){
               nota = (int)notasProgramacion.get(i);
               alumnoMayor = i;
           }
        }
        System.out.println(alumnoMayor);
        return alumnoMayor;
    }






}
