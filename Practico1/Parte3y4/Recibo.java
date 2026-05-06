// Ejercicio 3.2
public class Recibo extends Documento {

    // Ejercicio 3.2: Sobrescritura de método con lógica distinta
    @Override
    public void procesar() {
        System.out.println("Procesando Recibo: Validando pago y generando comprobante.");
    }
}