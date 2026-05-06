import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {
        // Ejercicio 1.1
        int[][] numero = new int[3][2];
        numero[0][0] = 10;
        numero[1][0] = 40;
        numero[2][0] = 50;

        int ultimo = numero[numero.length - 1][0];
        System.out.println("Ultimo espacio en la matriz: " + ultimo);

        // Ejercicio 1.2
        String[] nombre = {"Maximiliano", "Enzo", "Pedro", "Sofia"};
        Arrays.sort(nombre);

        String key = "Maximiliano";
        int posicion = Arrays.binarySearch(nombre, key);

        System.out.println("Posicion: " + posicion);
    }
}