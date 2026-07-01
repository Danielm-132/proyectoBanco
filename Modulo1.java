import java.util.Scanner;

public class Modulo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "";
        String contrasena = "";
        boolean sesionIniciada = false; 
        int opcion = 0;

        
        for(; !sesionIniciada;) { 
            System.out.println("===== MENU INICIAL =====");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            if(opcion == 1) {
                System.out.println(">> Crear cuenta");
                System.out.print("Ingrese nombre de usuario: ");
                usuario = sc.nextLine();
                System.out.print("Ingrese contraseña: ");
                contrasena = sc.nextLine();
                System.out.println("Cuenta creada exitosamente.");
            
            } else if(opcion == 2) {
                System.out.println(">> Iniciar sesion");
                System.out.print("Ingrese nombre de usuario: ");
                String usuarioLogin = sc.nextLine();
                System.out.print("Ingrese contraseña: ");
                String contrasenaLogin = sc.nextLine();

                if(usuarioLogin.equals(usuario) && contrasenaLogin.equals(contrasena)) {
                    System.out.println("Inicio de sesión exitoso. Bienvenido " + usuarioLogin);
                    sesionIniciada = true; 
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }
            } else if(opcion == 3) {
                System.out.println(">> Saliendo del sistema...");
                return; 
            } else {
                System.out.println(">> Opción inválida.");
            }
        }

        
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("4. Depositar");
        System.out.println("5. Retirar");
        System.out.println("6. Transferir");
        System.out.println("7. Reportes");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        if(opcion == 4) {
            System.out.println(">> Depositar");
        } else if(opcion == 5) {
            System.out.println(">> Retirar");
        } else if(opcion == 6) {
            System.out.println(">> Transferir");
        } else if(opcion == 7) {
            System.out.println(">> Reportes");
        } else if(opcion == 8) {
            System.out.println(">> Saliendo del sistema...");
        } else {
            System.out.println(">> Opción inválida.");
        }
    }
}