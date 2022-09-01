public class Pregunta2 {
    public static void main(String[] args) {
        String[] equipos = {"Manchester City", "Liverpool","Chelse", "Arsenal", "Tottenham", "Manchester United", "West Ham","Wolves","Newcastle United","Leicester City"};
        int[] puntos = {80, 79, 65, 60, 58, 54, 52, 49, 43, 42};
        int[] golesFavor = {80, 85, 67, 52, 56, 53, 52, 33, 40, 47};
        int[] golesContra = {21, 22, 27, 40, 38, 51, 44, 29, 55, 51};
        double promedioGol = promedioGoles(golesFavor);
        double promedioPuntos = promedioPuntos(puntos);
        String[] zona = {"Oeste", "Oeste", "Sur", "Sur", "Sur", "Este", "Sur", "Oeste", "Norte", "Este"};
        System.out.println("El promedio de goles en la Premier League es: "+ promedioGoles(golesFavor)); //Respuesta 1
        System.out.println("El promedio de puntos en la Premier League es: "+ promedioPuntos(puntos));
        System.out.println("El numero de equipos que superan el promedio de puntos es: " + equiposSuperanMediaPuntos(promedioPuntos,puntos));

    }
    public static double promedioGoles(int[] goles){
        double promedio = 0;
            for (int i=0; i<goles.length; i++){
                promedio = promedio + goles[i];
            }
        return promedio/goles.length;
    }
    public static double promedioPuntos(int[] puntos){
        double promedio = 0;
        for (int i=0; i<puntos.length; i++){
            promedio = promedio + puntos[i];
        }
        return promedio/puntos.length;
    }

    public static int equiposSuperanMediaPuntos(double promedioPuntos, int[] puntos){
        int numeroEquiposSuperan = 0;
        for (int i=0;i<puntos.length;i++){
            if (puntos[i]>=promedioPuntos) numeroEquiposSuperan++;

        }

        return numeroEquiposSuperan;
    }

}
