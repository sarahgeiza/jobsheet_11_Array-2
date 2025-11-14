import java.util.Scanner;
public class SurveiKepuasanPelanggan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println(" INPUT HASIL SURVEY ");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n RATA-RATA PER-RESPONDEN ");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;

            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }

            double rata = total / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\n RATA-RATA PER-PERTANYAAN ");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }

            double rata = total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        System.out.println("\n RATA-RATA KESELURUHAN ");
        double totalSemua = 0;
        int jumlahData = jumlahResponden * jumlahPertanyaan;

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = totalSemua / jumlahData;
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}
    

