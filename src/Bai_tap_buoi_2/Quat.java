package Bai_tap_buoi_2;

public class Quat {
    String thuonghieu;
    String loai;
    int gia;
    int congsuat;
    int capdo = 1;
    Boolean quayngang = false;
    int cham = 1;
    int trungbinh = 2;
    int nhanh = 3;
    Boolean bat = false;

    public Quat(String thuonghieu, String loai, int gia, int congsuat, int capdo, boolean bat, boolean quayngang) {
        this.thuonghieu = thuonghieu;
        this.loai = loai;
        this.gia = gia;
        this.congsuat = congsuat;
        this.capdo = capdo;
        this.bat = bat;
        this.quayngang = quayngang;
    }

    void hienthi() {
        System.out.println("Thuong Hieu:" + thuonghieu + " \nLoai: " + loai + " \nGia: " + gia + " \nCong Suat: " + congsuat);
    }
    public int capdocham() {
        return cham;
    }
    public int capdotrungbinh() {
        return trungbinh;
    }
    public int capdonhanh() {
        return nhanh;
    }
    public int choncapdo() {
        return capdo;
    }
    void chuyencapdo(int capdo) {
        this.capdo = capdo;
    }
    public boolean bat() {
        return bat;
    }
    void chonbat(boolean bat) {
        this.bat = bat;
    }
    public boolean quayngang(){
        return quayngang;
    }
    void chuyentrangthaiquay(boolean quayngang){
        this.quayngang = quayngang;
    }
    public String toString() {
        String a = "";
        if (this.bat()) {
            a += ("Quat dang bat\n");
            a += ("Quat dang o cap do: " + this.capdo + "\n");
            if (this.quayngang()){
                a +=("Quat dang quay ngang\n");
            } else {
                a +=("Quat dang dung yen");
            }
        } else {
            a += ("Quat dang tat");
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        Quat quat1 = new Quat("SENKO", "QUAT DUNG", 500000, 60, 3, true, true);
        quat1.hienthi();
        System.out.println(quat1.toString());
        System.out.println("----------------------------------------");
        Quat quat2 = new Quat("SENKO", "QUAT DUNG", 100000, 100, 2, false, true);
        quat2.hienthi();
        System.out.println(quat2.toString());
        System.out.println("----------------------------------------");
        Quat quat3 = new Quat("HATARI", "QUAT TREO TUONG", 300000, 80, 1, true, false);
        quat3.hienthi();
        System.out.println(quat3.toString());
    }
}
