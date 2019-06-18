import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//GIAODICHDAT:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOATDAT (A/B/C),DIENTICH , NHANVIEN(MA,TEN,SDT);
//GIAODICHNHA:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOAINHA (CAOCAP, THUONG), DIA CHI, DIENTICH, NHANVIEN(MA,TEN,SDT);
public abstract  class Giaodich {

    protected String magd, ngaygd;
    protected double dongia,dientich;
    protected NhanVien nv = new NhanVien();

    //Khoi tao, de truy cap vao thang va nam luc minh nhap;
    private int month;
    private int year;


//Constructor

    public Giaodich() {
        this.magd = "";
        this.ngaygd = "";
        this.dongia = 0;
        this.dientich = 0;
    }
    public Giaodich(String magd, String ngaygd, double dongia, double dientich) {
        this.magd = magd;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
        this.dientich = dientich;
    }
    public Giaodich(Giaodich gd) {
        this.magd = gd.magd;
        this.ngaygd = gd.ngaygd;
        this.dongia = gd.dongia;
        this.dientich = gd.dientich;
    }
    //Getter - Setter
    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }


    //method
    
    public void Input()
    {
        Scanner cin = new Scanner(System.in);
        System.out.print ("Nhap MaGiaoDich: ");
        setMagd(cin.nextLine());
        String dateString;
        System.out.print("Ngay Giao Dich (dd/MM/yyyy): ");
        dateString = cin.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            Date d = dateFormat.parse(dateString);
            Calendar c;
            c = Calendar.getInstance();
            c.setTime(d);
            setYear(c.get(Calendar.YEAR));
            setMonth(c.get(Calendar.MONTH) + 1);//+1 là quan tr?ng b?i vì các tháng mang giá tr? tr??ng ?ng t? 0 ??n 11 // Is Important Because if the month is January then coming 0 so Add +1
        } catch (ParseException e) {
            System.out.println("Ngay khong hop le!!!");
            e.printStackTrace();
        }
        setNgaygd(dateString);
        System.out.print ("Nhap DonGia: ");
        setDongia(cin.nextDouble());
        System.out.print ("Nhap DienTich: ");
        setDientich(cin.nextDouble());
        nv.Input();
    }
    
    public void Output()
    {
    	System.out.printf ("%-10s %-5s %-12.2f %-10.2f",getMagd(),getNgaygd(),getDongia(),getDientich());
    	nv.Output();
    }
    public abstract double Tinhtien();
}
