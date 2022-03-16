import java.util.Map;
import java.util.Scanner;
public class HoaDon {
    protected int MaHD , MaP;
    String TenKH;
    protected String NgayHD;
    protected double DonGia;
    Scanner in = new Scanner (System.in);
    private double d;
    private double e;

    protected HoaDon()
    {

        this.MaHD=0;
        this.DonGia=0;
        this.NgayHD="";
        this.TenKH="";
        this.MaP=0;
    }
    protected HoaDon (int ma , double dgia , String ngay, String ten , int map , double ttien )
    {
        this.MaHD=ma;
        this.DonGia=dgia;
        this.NgayHD=ngay;
        this.TenKH=ten;
        this.MaP=map;
        this.ThanhTien=ttien;
    }
    protected int getMaHd () {
        return MaHD;
    }
    protected void setMaHD( int maHD)  {
        MaHD = maHD;
    }
    protected double getDonGia() {
        return DonGia;
    }
    protected void setDonGia (double donGia) {
        DonGia = donGia;
    }
    protected String getNgayHD () {
        return NgayHD;
    }
    protected void setNgayHD (String ngayHD) {
        NgayHD = ngayHD;
    }
    protected String getTenKH () {
        return TenKH;
    }
    protected void setTenKH (String tenKH) {
        TenKH = tenKH;
    }
    protected int getMaP() {
        return MaP;
    }
    protected void setMaP (int Map) {
        MaP = Map;
    } 
    protected double getThanhTien() {
        return ThanhTien;
    }
    protected void setThanhTien (double thanhTien) {
     thanhTien = thanhTien;
    }

    protected void nhap() {
        System.out.println("Nhap Ma Hoa Don: ");
        MaHD = in.nextInt();
        System.out.println("Ho Va Ten Khach Hang: ");
        TenKH = in.nextInt();
        System.out.println("Ngay Thang Va Nam Lap Hoa Don: ");
        NgayHD = in.nextInt();
        System.out.println("Ma Phong: ");
        MaP = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextInt();
    }

    public String toString () {
        return "MaHD: " + MaHD + ", TenKH: " + TenKH + ", NgayHD:" + NgayHD +  ", DonGia:" + DonGia + ", MaP: " +  MaP;]
    }
}
