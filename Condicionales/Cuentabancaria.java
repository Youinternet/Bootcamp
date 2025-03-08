import javax.swing.JOptionPane;

public class Cuentabancaria {
    // Funciones
    public static double consultarSaldo(double saldo) {
        return saldo;
    }

    public static double retirar(double saldo) {
        String retiro = JOptionPane.showInputDialog("Ingrese el valor a retirar");
        double retiro1 = Double.parseDouble(retiro);
        // Validar si el saldo es suficiente para realizar el retiro
        if (saldo < retiro1) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo = saldo - retiro1;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo restante: " + saldo);
        }
        return saldo;
    }

    public static double consignar(double saldo) {
        String consignacion = JOptionPane.showInputDialog("Ingrese el valor a consignar");
        double consignacion1 = Double.parseDouble(consignacion);
        saldo = saldo + consignacion1;
        JOptionPane.showMessageDialog(null, "Consignación exitosa. Nuevo saldo: " + saldo);
        return saldo;
    }

    public static void main(String[] args) {
        double saldo = 0; // Saldo inicial
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        while (true) {
            JOptionPane.showMessageDialog(null, "Bienvenido a tu sistema Bancario\n" + nombre);
            
            String opcion = JOptionPane.showInputDialog("1. Consultar saldo\n2. Retirar\n3. Realizar consignación\n4. Salir");
            int opcion1 = Integer.parseInt(opcion);

            if (opcion1 == 4) {
                break;
            }

            switch (opcion1) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Tu saldo es: " + consultarSaldo(saldo));
                    break;
                case 2:
                    saldo = retirar(saldo);
                    break;
                case 3:
                    saldo = consignar(saldo);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta nuevamente.");
                    break;
            }
        }
    }
}
