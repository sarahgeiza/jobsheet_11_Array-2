import java.util.Scanner;
public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[][] penonton = new String[4][2];  // 4 baris, 2 kolom
        int menu;
        int baris, kolom;
        String nama;

        while (true) {
            System.out.println("\n MENU BIOSKOP ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); // buang newline dari nextInt()

            if (menu == 1) {
                // INPUT DATA PENONTON
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();

                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine(); // buang newline

                // Simpan data ke array
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton berhasil disimpan!");

            } else if (menu == 2) {
                // TAMPILKAN DAFTAR PENONTON
                System.out.println("\n DAFTAR PENONTON ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("[Kosong]\t");
                        } else {
                            System.out.print("[" + penonton[i][j] + "]\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                // EXIT PROGRAM
                System.out.println("Program selesai.");
                break;

            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}