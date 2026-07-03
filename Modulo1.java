import java.util.Scanner;

public class Modulo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sesionIniciada = false;
        int opcion = 0;
        int indiceCuenta = -1;

        while (!sesionIniciada) {
            System.out.println("===== MENU INICIAL =====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println(">> Crear cuenta");
                System.out.print("Ingrese nombre de usuario: ");
                String usuario = sc.nextLine();
                System.out.print("Ingrese contraseña: ");
                String contrasena = sc.nextLine();

        
                modulo2.crearCuenta(usuario, contrasena);

            } else if (opcion == 2) {
                System.out.println(">> Iniciar sesion");
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
                System.out.println(">> Saliendo del sistema...");
                return;
            } else {
                System.out.println(">> Opción inválida.");
            }
        }

        
        do {
            System.out.println("=MENU PRINCIPAL=");
            System.out.println("4. Depositar");
            System.out.println("5. Retirar");
            System.out.println("6. Transferir");
            System.out.println("7. Consultar saldo");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 4) {
                System.out.println(">> Depositar");
                System.out.print("Ingrese monto a depositar: ");
                double monto = sc.nextDouble();
                modulo3.depositar(indiceCuenta, monto);

            } else if (opcion == 5) {
                System.out.println(">> Retirar");
                System.out.print("Ingrese monto a retirar: ");
                double monto = sc.nextDouble();
                modulo3.retirar(indiceCuenta, monto);

            } else if (opcion == 6) {
                System.out.println(">> Transferir");
                System.out.print("Ingrese usuario destino: ");
                String usuarioDestino = sc.nextLine();
                int indiceDestino = -1;

                // Buscar la cuenta destino en Modulo2
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

            } else if (opcion == 7) {
                System.out.println(">>Consultar saldo");
                modulo3.mostrarSaldo(indiceCuenta);

            } else if (opcion == 8) {
                System.out.println(">> Saliendo del sistema...");
                modulo5.salir();
            } else {
                System.out.println(">> Opción inválida.");
            }

        } while (opcion != 8);
    }
}
