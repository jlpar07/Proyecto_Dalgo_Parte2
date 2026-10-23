/*
 * Autores: Yeiner Ibarguen, Jose Luis Parra
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ProblemaP2 {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter salida = new BufferedWriter(new OutputStreamWriter(System.out));

        int casos = Integer.parseInt(entrada.readLine().trim());

        for (int caso = 0; caso < casos; caso++) {
            String linea = entrada.readLine();

            // Cada caso ocupa una linea y contiene la permutacion completa.
            while (linea != null && linea.isEmpty()) {
                linea = entrada.readLine();
            }

            int[] permutacion = leerPermutacion(linea);
            salida.write(Integer.toString(numeroComponentes(permutacion)));
            salida.newLine();
        }

        salida.flush();
    }

    private static int[] leerPermutacion(String linea) {
        StringTokenizer tokens = new StringTokenizer(linea);
        int[] permutacion = new int[tokens.countTokens()];

        for (int i = 0; i < permutacion.length; i++) {
            permutacion[i] = Integer.parseInt(tokens.nextToken());
        }

        return permutacion;
    }

    private static int numeroComponentes(int[] permutacion) {  //aqui iria la solucion del problema, que es contar el numero de componentes de la permutacion
        // posible solución
        int componentes = 0;
        int maxVisto = 0;
        for (int i = 0; i < permutacion.length; i++){
            maxVisto = Math.max(maxVisto, permutacion[i]);
            if (maxVisto == i + 1){
                componentes++;
            }


        }
        return componentes;
    }
}
