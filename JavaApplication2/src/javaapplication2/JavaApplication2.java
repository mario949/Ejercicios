package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {


public class Banco {
    public static void main(String[] args) {
        double saldoCuenta1 = 500.00;
        double saldoCuenta2 = 300.00;
        
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            double monto;
            
            do {
                System.out.println("\nSaldo de la Cuenta No 1: " + saldoCuenta1);
                System.out.println("Saldo de la Cuenta No 2: " + saldoCuenta2);
                System.out.println("\nElija una opción:");
                System.out.println("1. Abonar a la Cuenta No 1");
                System.out.println("2. Abonar a la Cuenta No 2");
                System.out.println("3. Debitar de la Cuenta No 1");
                System.out.println("4. Debitar de la Cuenta No 2");
                System.out.println("5. Consultar saldos");
                System.out.println("6. Salir");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese un valor para abonar a la cuenta No 1: ");
                        monto = scanner.nextDouble();
                        saldoCuenta1 += monto;
                    }
                    case 2 -> {
                        System.out.print("Ingrese un valor para abonar a la cuenta No 2: ");
                        monto = scanner.nextDouble();
                        saldoCuenta2 += monto;
                    }
                    case 3 -> {
                        System.out.print("Ingrese un valor para debitar de la cuenta No 1: ");
                        monto = scanner.nextDouble();
                        if (monto <= saldoCuenta1) {
                            saldoCuenta1 -= monto;
                        } else {
                            System.out.println("Fondos insuficientes en la cuenta No 1.");
                        }
                    }
                    case 4 -> {
                        System.out.print("Ingrese un valor para debitar de la cuenta No 2: ");
                        monto = scanner.nextDouble();
                        if (monto <= saldoCuenta2) {
                            saldoCuenta2 -= monto;
                        } else {
                            System.out.println("Fondos insuficientes en la cuenta No 2.");
                        }
                    }
                    case 5 -> {
                        System.out.println("\nSaldo de la Cuenta No 1: " + saldoCuenta1);
                        System.out.println("Saldo de la Cuenta No 2: " + saldoCuenta2);
                    }
                    case 6 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 6);
        }
    }
  }
}
  