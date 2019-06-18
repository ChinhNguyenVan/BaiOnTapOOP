import java.util.Scanner;
//GIAODICHDAT:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOATDAT (A/B/C),DIENTICH , NHANVIEN(MA,TEN,SDT);
//GIAODICHNHA:MAGD, NGAYGIAODICH (ngày/tháng/ nam), DONGIA, LOAINHA (CAOCAP, THUONG), DIA CHI, DIENTICH, NHANVIEN(MA,TEN,SDT);
class Giaodichnha extends Giaodich {

    private String loainha,diachi;
    
    //Constructor
    public Giaodichnha() {
        this.loainha = "";
        this.diachi = "";
    }
    public Giaodichnha(String loainha, String diachi) {
        this.loainha = loainha;
        this.diachi = diachi;
    }
    public Giaodichnha(Giaodichnha gdn) {
        this.loainha = gdn.loainha;
        this.diachi = gdn.diachi;
    }
    //Getter - Setter
    public String getLoainha() {
        return loainha;
    }
        
    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    //Method
    public void Input(){
    	Scanner cin = new Scanner(System.in);
    	super.Input();
    	System.out.print ("Nhap LoaiNha(caocap/thuong): ");
    	setLoainha(cin.nextLine().toLowerCase());
    	System.out.print ("Nhap DiaChi: ");
    	setDiachi(cin.nextLine());
    }
    
    public void Output(){
    	super.Output();
    	System.out.printf ("%-10s %-20s %-12.2f",getLoainha(),getDiachi(),Tinhtien());
    }
    public double Tinhtien(){
    	if(loainha.equals("caocap"))
    		return (getDientich()*getDongia());
    	else
    		return (getDientich()*getDongia()*0.9);
    }
}
