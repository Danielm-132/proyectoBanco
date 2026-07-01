public class modulo2 {
    // Arreglos para almacenar la información de las cuentas
    static String[] usuarios = new String[5];     // nombres de usuario
    static String[] contrasenas = new String[5];  // contraseñas
    static double[] saldos = new double[5];       // saldos de cada cuenta
    static int totalCuentas = 0;                    // contador de cuentas creadas

    // Función para crear una cuenta (saldo inicial siempre 0)
    public static void crearCuenta(String usuario, String contrasena) {
        usuarios[totalCuentas] = usuario;
        contrasenas[totalCuentas] = contrasena;
        saldos[totalCuentas] = 0; // todas las cuentas empiezan con saldo 0
        totalCuentas++;
        System.out.println("Cuenta creada exitosamente con saldo $0.");
    }

    // Función para iniciar sesión
    public static int iniciarSesion(String usuario, String contrasena) {
        for (int i = 0; i < totalCuentas; i++) {
            if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                return i; // devuelve el índice de la cuenta encontrada
            }
        }
        return -1; // si no encuentra la cuenta, devuelve -1
    }

    // Función para mostrar todas las cuentas (solo para pruebas)
    public static void mostrarCuentas() {
        for (int i = 0; i < totalCuentas; i++) {
            System.out.println("Usuario: " + usuarios[i] + " | Saldo: $" + saldos[i]);
        }
    }
}

