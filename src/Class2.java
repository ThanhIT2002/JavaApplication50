/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Class2 extends Class {

    private int  SoPhieuMuon;
    private String NgayMuon,han;
    public Class2() {
    }
    public Class2(int SoPhieuMuon,String NgayMuon,String han,String MaSV, String HoTen, String Lop, int namsinh){
        super(MaSV,HoTen,Lop,namsinh);
        this.NgayMuon=NgayMuon;
        this.SoPhieuMuon=SoPhieuMuon;
        this.han=han;
    }
    public int getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(int SoPhieuMuon) {
        this.SoPhieuMuon = SoPhieuMuon;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getHan() {
        return han;
    }

    public void setHan(String han) {
        this.han = han;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phiếu mượn: ");
        this.setSoPhieuMuon(sc.nextInt());
        System.out.print("Nhập Ngày mượn : ");
        sc.next();
        this.setNgayMuon(sc.nextLine());
        System.out.print("Nhập Hạn: ");
        this.setHan(sc.nextLine());
    }
    public void output(){
        super.output();
        System.out.printf("%-15d%-15s%-15s",this.getSoPhieuMuon(),this.getNgayMuon(),this.getHan());
        System.out.println("");
    }
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        n = sc.nextInt();
        ArrayList<Class2> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            Class2 cl2 = new Class2();
            cl2.input();
            list.add(cl2);
            System.out.println("----------------------------------");
        }
        for(Class2 temp:list){
            temp.output();
        }
                     System.out.println("Sắp xếp tên theo thứ tự tăng dần");
               
           for(int i=0;i<n-1;i++){
                for(int j = i+1; j < n; j++){
                            if(list.get(i).getHoTen().compareTo(list.get(j).getHoTen())>0){
                                Class2 tem = list.get(i);
                                list.set(i,list.get(j));
                                list.set(j, tem);
                            }
                    }
           }
                        for(Class2 t:list){
                         t.output();
                     }
           
    }
}
