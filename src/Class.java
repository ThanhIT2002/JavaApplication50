
import java.util.Scanner;

public class Class {

    public Class() {
    }

    public Class(String MaSV, String HoTen, String Lop, int namsinh) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.namsinh = namsinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    private String MaSV,HoTen,Lop;
    private int namsinh;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã sinh viên: ");
        this.setMaSV(sc.nextLine());
        System.out.print("Nhập Họ và tên sinh viên: ");
        this.setHoTen(sc.nextLine());
        System.out.print("Nhập Năm sinh sinh viên: ");
        this.setNamsinh(sc.nextInt());
        System.out.print("Nhập lớp sinh viên: ");
        sc.nextLine();
        this.setLop(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-15s%-15s%-15d%-15s",this.getMaSV(),this.getHoTen(),this.getNamsinh(),this.getLop());
    }
    
}
