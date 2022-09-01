import java.util.LinkedList;
import java.util.List;

public class Sesion5Listas{
    public static void main(String[] args) {
        int numero = 10;
        LinkedList lista = hallarNumNatu(numero);
        System.out.println("Números Naturales menores de "+numero+" múltiplos de 3 y 5 son : "+lista);
        int suma = hallarSumaMultiplos(lista);
        System.out.println("Suma de Números Naturales menores de "+numero+" múltiplos de 3 y 5 es : "+suma);
    }

    public static LinkedList hallarNumNatu(int numero) {
        LinkedList lista = new LinkedList();
        while (numero>0){
            numero--;
            if (numero>0){
                if (numero % 3 == 0){
                    //System.out.println("Número: "+numero);
                    //System.out.println("Múltiplo 3");
                    lista.add(numero);
                }else if(numero % 5 == 0){
                    //System.out.println("Número: "+numero);
                    //System.out.println("Múltiplo 5");
                    lista.add(numero);
                }
            }
        }
        return lista;
    }

    public static int hallarSumaMultiplos(LinkedList lista) {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + (int)lista.get(i);
        }
        return suma;
    }



}




// lista1.add(); y lista1.addFirst();
// recorrido con while o for
// lista1.remove; o lista1.removeLast();
