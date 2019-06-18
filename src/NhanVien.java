import java.util.Scanner;
class NhanVien {

    private String manv,tennv,sdt;
    //constructor
    public NhanVien() {
        this.manv = "";
        this.tennv = "";
        this.sdt = "";
    }

    public NhanVien(String manv, String tennv, String sdt) {
        this.manv = manv;
        this.tennv = tennv;
        this.sdt = sdt;
    }
    
    public NhanVien(NhanVien nv){
        this.manv = nv.manv;
        this.tennv = nv.tennv;
        this.sdt = nv.sdt;
    }
    
    //Getter-Setter
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    //Method
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print ("Nhap Ma nv: ");
        setManv(cin.nextLine());
        System.out.print ("Nhap Ten nv: ");
        setTennv(cin.nextLine());
        System.out.print ("Nhap SDT: ");
        setSdt(cin.nextLine());
    }
    public void Output(){
        System.out.printf ("%-10s %-20s %-12s",getManv(),getTennv(),getSdt());
    }
}