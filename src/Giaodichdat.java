import java.util.Scanner;
//GIAODICHDAT:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOATDAT (A/B/C),DIENTICH , NHANVIEN(MA,TEN,SDT);
//GIAODICHNHA:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOAINHA (CAOCAP, THUONG), DIA CHI, DIENTICH, NHANVIEN(MA,TEN,SDT);
class Giaodichdat extends Giaodich {

    private String loaidat;

    //Constructor
    public Giaodichdat() {
        this.loaidat = "";
    }
    
    public Giaodichdat(String loaidat) {
        this.loaidat = loaidat;
    }
    
    public Giaodichdat(Giaodichdat gdd) {
        this.loaidat = gdd.loaidat;
    }
    
    //Getter - Setter
    
    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }
    
    //Method
    public void Input(){
    	Scanner cin = new Scanner(System.in);
    	super.Input();
    	System.out.print ("Nhap LoaiDat(A/B/C): ");
    	setLoaidat(cin.nextLine().toUpperCase());// Co them ham toUpperCase de in hoa chu cai va so sanh de tinh tien
    }
    
    public void Output(){
    	super.Output();
    	System.out.printf ("%-5s %-12.2f",getLoaidat(),Tinhtien());
    }
    public double Tinhtien(){
    	if(loaidat.equals("A"))
    		return (getDientich()*getDongia()*1.5);
    	else
    		return (getDientich()*getDongia());
    }
}
