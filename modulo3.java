public class modulo3 {
    // Depositar dinero
    public static void depositar(int indiceCuenta, double monto) {
        if (monto > 0) {
            modulo2.saldos[indiceCuenta] += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + modulo2.saldos[indiceCuenta]);
        } else {
            System.out.println("Error: el monto debe ser positivo.");
        }
    }

    // Retirar dinero
    public static void retirar(int indiceCuenta, double monto) {
        if (monto > 0 && monto <= modulo2.saldos[indiceCuenta]) {
            modulo2.saldos[indiceCuenta] -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + modulo2.saldos[indiceCuenta]);
        } else {
            System.out.println("Error: saldo insuficiente o monto inválido.");
        }
    }

    // Transferir dinero entre cuentas
    public static void transferir(int indiceOrigen, int indiceDestino, double monto) {
        if (monto > 0 && monto <= modulo2.saldos[indiceOrigen]) {
            modulo2.saldos[indiceOrigen] -= monto;
            modulo2.saldos[indiceDestino] += monto;
            System.out.println("Transferencia exitosa. Nuevo saldo origen: $" + modulo2.saldos[indiceOrigen]);
        } else {
            System.out.println("Error: saldo insuficiente o monto inválido.");
        }
    }

    // Consultar saldo disponible
    public static void mostrarSaldo(int indiceCuenta) {
        System.out.println("Saldo disponible: $" + modulo2.saldos[indiceCuenta]);
    }
}
