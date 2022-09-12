import java.util.Scanner;
public class tong_cac_chu_so_cua_n {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.printf("Tổng của các chữ số "
                + "của %d là: %d", n, tongcacchuso(n));
    }
    public static int tongcacchuso(int n) {
        int tong = 0;
        do {
            tong = tong + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return tong;
    }
}
