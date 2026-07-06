public class modulo2 {
    
    static String[] usuarios = new String[5];    
    static String[] contrasenas = new String[5];  
    static double[] saldos = new double[5];       
    static int totalCuentas = 0;                  
    static double[] retiros = new double[5]; 

    public static void crearCuenta(String usuario, String contrasena) {
        usuarios[totalCuentas] = usuario;
        contrasenas[totalCuentas] = contrasena;
        saldos[totalCuentas] = 0; 
        totalCuentas++;
        System.out.println("Cuenta creada exitosamente con saldo $0.");
    }

    public static int iniciarSesion(String usuario, String contrasena) {
        for (int i = 0; i < totalCuentas; i++) {
            if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                return i; 
            }
        }
        return -1; 
    }

    
    public static void mostrarCuentas() {
        for (int i = 0; i < totalCuentas; i++) {
            System.out.println("Usuario: " + usuarios[i] + " | Saldo: $" + saldos[i]);
        }
    }
}