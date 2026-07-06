public class modulo4 {
    public static void reporteRetiros() {
        // ordenar burbuja
        for (int i = 0; i < modulo2.totalCuentas; i++) {
            for (int j = 0; j < modulo2.totalCuentas - 1; j++) {
                if (modulo2.retiros[j] > modulo2.retiros[j+1]) {
                    double temp = modulo2.retiros[j];
                    modulo2.retiros[j] = modulo2.retiros[j+1];
                    modulo2.retiros[j+1] = temp;

                    String tempUsuario = modulo2.usuarios[j];
                    modulo2.usuarios[j] = modulo2.usuarios[j+1];
                    modulo2.usuarios[j+1] = tempUsuario;
                }
            }
        }
        //reporte
        for (int i = 0; i < modulo2.totalCuentas; i++) {
            System.out.println("Usuario: " + modulo2.usuarios[i] + " | Retiros: $" + modulo2.retiros[i]);
        }
    }
}