package edu.ort.t1.mate;

import java.util.Scanner;

public class NumberConverter {

    public static double binToDec(String binNum) {
        double decimal = 0;
        String[] parts = binNum.split("\\.");

        System.out.println("\n+ Conversión Binario a Decimal:");

        System.out.println("- Parte entera:");
        for (int i = 0; i < parts[0].length(); i++) {
            int bit = parts[0].charAt(parts[0].length() - 1 - i) - '0';
            double value = bit * Math.pow(2, i);
            decimal += value;
            System.out.println(bit + " × 2^" + i + " = " + value);
        }

        if (parts.length > 1) {
            System.out.println("- Parte fraccionaria:");
            for (int i = 0; i < parts[1].length(); i++) {
                int bit = parts[1].charAt(i) - '0';
                double value = bit / Math.pow(2, i + 1);
                decimal += value;
                System.out.println(bit + " / 2^" + (i + 1) + " = " + value);
            }
        }

        return decimal;
    }

    public static double octToDec(String octNum) {
        double decimal = 0;
        String[] parts = octNum.split("\\.");

        System.out.println("\n+ Conversión Octal a Decimal:");

        System.out.println("- Parte entera:");
        for (int i = 0; i < parts[0].length(); i++) {
            int digit = parts[0].charAt(parts[0].length() - 1 - i) - '0';
            double value = digit * Math.pow(8, i);
            decimal += value;
            System.out.println(digit + " × 8^" + i + " = " + value);
        }

        if (parts.length > 1) {
            System.out.println("- Parte fraccionaria:");
            for (int i = 0; i < parts[1].length(); i++) {
                int digit = parts[1].charAt(i) - '0';
                double value = digit / Math.pow(8, i + 1);
                decimal += value;
                System.out.println(digit + " / 8^" + (i + 1) + " = " + value);
            }
        }

        return decimal;
    }

    public static double hexToDec(String hexNum) {
        double decimal = 0;
        String[] parts = hexNum.split("\\.");

        System.out.println("\n+ Conversión Hexadecimal a Decimal:");

        System.out.println("- Parte entera:");
        for (int i = 0; i < parts[0].length(); i++) {
            char digitChar = parts[0].charAt(parts[0].length() - 1 - i);
            int digit = Character.digit(digitChar, 16);
            double value = digit * Math.pow(16, i);
            decimal += value;
            System.out.println(digitChar + " × 16^" + i + " = " + value);
        }

        if (parts.length > 1) {
            System.out.println("- Parte fraccionaria:");
            for (int i = 0; i < parts[1].length(); i++) {
                char digitChar = parts[1].charAt(i);
                int digit = Character.digit(digitChar, 16);
                double value = digit / Math.pow(16, i + 1);
                decimal += value;
                System.out.println(digitChar + " / 16^" + (i + 1) + " = " + value);
            }
        }

        return decimal;
    }

    public static String decToBase(double decimal, int base) {
        if (base != 2 && base != 8 && base != 16) {
            return "Base no soportada";
        }

        long integerPart = (long) decimal;
        double fractionalPart = decimal - integerPart;
        StringBuilder result = new StringBuilder();

        System.out.println("\n+ Conversión Decimal a Base " + base + ":");

        System.out.println("- Parte entera:");
        while (integerPart > 0) {
            long remainder = integerPart % base;
            result.insert(0, Integer.toString((int) remainder, base).toUpperCase());
            System.out.println(integerPart + " ÷ " + base + " = " + (integerPart / base) + ", residuo: " + remainder);
            integerPart /= base;
        }

        if (fractionalPart > 0) {
            result.append(".");
            System.out.println("- Parte fraccionaria:");
            for (int i = 0; i < 5; i++) { // Máximo 5 dígitos fraccionarios
                fractionalPart *= base;
                int digit = (int) fractionalPart;
                result.append(Integer.toString(digit, base).toUpperCase());
                System.out.println(fractionalPart + " * " + base + " = " + digit);
                fractionalPart -= digit;
                if (fractionalPart == 0) break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nIngrese la base de origen (hex, dec, bin, oct) o 0 para salir: ");
            String baseFrom = scanner.nextLine().toLowerCase();

            if (baseFrom.equals("0")) {
                break;
            }

            System.out.print("Ingrese el número a convertir: ");
            String num = scanner.nextLine();

            System.out.print("Ingrese la base de destino (hex, dec, bin, oct): ");
            String baseTo = scanner.nextLine().toLowerCase();

            String result = convertNumber(num, baseFrom, baseTo);
            System.out.println("\n🔹 Resultado final: " + result);
        }

        scanner.close();
    }

    public static String convertNumber(String num, String baseFrom, String baseTo) {
        double decimalValue = 0;

        switch (baseFrom) {
            case "dec":
                decimalValue = Double.parseDouble(num);
                break;
            case "bin":
                decimalValue = binToDec(num);
                break;
            case "oct":
                decimalValue = octToDec(num);
                break;
            case "hex":
                decimalValue = hexToDec(num);
                break;
            default:
                return "Base no soportada";
        }

        if (baseTo.equals("dec")) {
            return Double.toString(decimalValue);
        }

        int targetBase;
        switch (baseTo) {
            case "bin":
                targetBase = 2;
                break;
            case "oct":
                targetBase = 8;
                break;
            case "hex":
                targetBase = 16;
                break;
            default:
                return "Base no soportada";
        }

        return decToBase(decimalValue, targetBase);
    }
}
