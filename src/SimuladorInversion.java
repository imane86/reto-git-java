import java.util.Scanner;

public class SimuladorInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SIMULADOR DE INVERSIÓN EN ACCIONES ===");
        
        System.out.print("Ingresa tu capital inicial: ");
        double capital = sc.nextDouble();
        
        System.out.print("Precio de la acción a comprar: ");
        double precioAccion = sc.nextDouble();
        
        System.out.print("Numero de acciones a comprar: ");
        int cantidad = sc.nextInt();
        
        double totalInvertido = precioAccion * cantidad;
        System.out.println("Total invertido: " + totalInvertido);
        
        System.out.print("Nuevo precio de la accino: ");
        double nuevoPrecio = sc.nextDouble();
        
        double valorActual = nuevoPrecio * cantidad;
        double gananciaPerdida = valorActual - totalInvertido;
        
        System.out.println("Valor actual de la inversión: " + valorActual);
        if (gananciaPerdida > 0) {
            System.out.println("¡Ganancia obtenida: " + gananciaPerdida + "!");
        } else if (gananciaPerdida < 0) {
            System.out.println("Pérdida sufrida: " + gananciaPerdida);
        } else {
            System.out.println("No hay ganancia ni pérdida.");
        }
        
        sc.close();
    }
}
