/**
 * Program sederhana untuk menghitung gaya gravitasi antara dua objek berdasarkan
 * Hukum Gravitasi Universal Newton.
 */
import java.util.Scanner;

public class HitungGravitasi {
    /**
     * Konstanta gravitasi universal (m^3/kg/s^2).
     */
    private static final double G = 6.67430e-11;

    /**
     * Metode utama untuk menjalankan program.
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        double massa1, massa2, jarak;

        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Gaya Gravitasi");
        System.out.print("Masukkan massa objek 1 (kg): ");
        massa1 = input.nextDouble();
        System.out.print("Masukkan massa objek 2 (kg): ");
        massa2 = input.nextDouble();
        System.out.print("Masukkan jarak antara kedua objek (meter): ");
        jarak = input.nextDouble();

        // Menghitung gaya gravitasi
        double gayaGravitasi = (G * massa1 * massa2) / (jarak * jarak);

        System.out.println("Gaya gravitasi antara kedua objek adalah: " + gayaGravitasi + " Newton");
    }
}