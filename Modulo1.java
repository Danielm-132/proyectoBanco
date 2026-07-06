import java.util.Scanner;

public class Modulo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int indiceCuenta = -1;

        while (true) { 
            boolean sesionIniciada = false;

            // MENU INICIAL
            while (!sesionIniciada) {
                System.out.println("===== MENU INICIAL =====");
                System.out.println("1. Crear cuenta");
                System.out.println("2. Iniciar sesion");
                System.out.println("3. Salir del sistema");
                System.out.println("4. Reporte de retiros");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 1) {
                    System.out.println("Crear cuenta");
                    System.out.print("Ingrese nombre de usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contrasena = sc.nextLine();
                    modulo2.crearCuenta(usuario, contrasena);

                } else if (opcion == 2) {
                    System.out.println("Iniciar sesion");
                    System.out.print("Ingrese nombre de usuario: ");
                    String usuarioLogin = sc.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contrasenaLogin = sc.nextLine();

                    indiceCuenta = modulo2.iniciarSesion(usuarioLogin, contrasenaLogin);
                    if (indiceCuenta != -1) {
                        System.out.println("Inicio de sesión exitoso. Bienvenido " + usuarioLogin);
                        sesionIniciada = true;
                    } else {
                        System.out.println("Usuario o contraseña incorrectos.");
                    }

                } else if (opcion == 3) {
                    System.out.println("Saliendo del sistema...");
                    return; 
                } else {
                    System.out.println("Opción inválida.");
                }
            }

            // MENU PRINCIPAL 
            do {
                System.out.println("=MENU PRINCIPAL=");
                System.out.println("5. Depositar");
                System.out.println("6. Retirar");
                System.out.println("7. Transferir");
                System.out.println("8. Consultar saldo");
                System.out.println("9. Cerrar sesión");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion == 5) {
                    System.out.println("Depositar");
                    System.out.print("Ingrese monto a depositar: ");
                    double monto = sc.nextDouble();
                    modulo3.depositar(indiceCuenta, monto);

                } else if (opcion == 6) {
                    System.out.println("Retirar");
                    System.out.print("Ingrese monto a retirar: ");
                    double monto = sc.nextDouble();
                    modulo3.retirar(indiceCuenta, monto);

                } else if (opcion == 7) {
                    System.out.println("Transferir");
                    System.out.print("Ingrese usuario destino: ");
                    String usuarioDestino = sc.nextLine();
                    int indiceDestino = -1;
                    for (int i = 0; i < modulo2.totalCuentas; i++) {
                        if (modulo2.usuarios[i].equals(usuarioDestino)) {
                            indiceDestino = i;
                            break;
                        }
                    }
                    if (indiceDestino != -1) {
                        System.out.print("Ingrese monto a transferir: ");
                        double monto = sc.nextDouble();
                        modulo3.transferir(indiceCuenta, indiceDestino, monto);
                    } else {
                        System.out.println("Error: usuario destino no encontrado.");
                    }

                } else if (opcion == 8) {
                    System.out.println("Consultar saldo");
                    modulo3.mostrarSaldo(indiceCuenta);

                } else if (opcion == 9) {
                    System.out.println(">> Cerrando sesión...");
                    sesionIniciada = false; 
                } else if (opcion == 4) {
                    System.out.println(" Reporte de retiros");
                    modulo4.reporteRetiros();
                } else {
                    System.out.println("Opción inválida.");
                }

            } while (opcion != 8);
        }
    }
}
