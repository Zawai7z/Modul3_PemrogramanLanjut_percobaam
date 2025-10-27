import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");

        try {
            if (!sc.hasNextDouble()) {
                throw new InvalidNumberException("Input harus berupa angka!");
            }

            double num = sc.nextDouble();
            validateNumber(num);
            System.out.println("Angka valid: " + num);

        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateNumber(double num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Angka harus positif (lebih dari 0).");
        }
    }
}
