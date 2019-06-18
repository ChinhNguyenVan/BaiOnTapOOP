import java.util.*;

public class Quanly {
    protected ArrayList<Giaodich> List = new ArrayList<Giaodich>();
    Scanner cin = new Scanner(System.in);
    byte loai;
    //1.NHAP DANH SACH GIAO DICH
    public void Input(byte loai){
        if(loai == 1){
            System.out.println("====================================");
            System.out.println("=========== NHAP GIAO DICH DAT ============");
            System.out.println("====================================");
            Giaodichdat gdd = new Giaodichdat();
            gdd.Input();
            List.add(gdd);
        }
        else {
            System.out.println("====================================");
            System.out.println("=========== NHAP GIAO DICH NHA ============");
            System.out.println("====================================");
            Giaodichnha gdn = new Giaodichnha();
            gdn.Input();
            List.add(gdn);
        }
    }
    //2.XUAT DANH SACH GIAO DICH

    public void Output(byte loai){
        if(loai == 1) {
            System.out.println("==== DANH SACH GIAO DICH DAT ===");
            System.out.printf("%-10s %-5s %-12s %-10s %-10s %-20s %-12s %-5s %-12s\n","MAGD","NGAYGD","DONGIA","DIENTICH","MANV","TENNV","SDTNV","LOAIDAT","TONGTIEN");
            for(Giaodich gd: List)
            {
                if(gd instanceof Giaodichdat)
                {
                    gd.Output();
                    System.out.println("");
                }
            }
        }
        else if(loai == 2){
            System.out.println("==== DANH SACH GIAO DICH NHA ===");
            System.out.printf("%-10s %-5s %-12s %-10s %-10s %-20s %-12s %-10s %-20s %-12s\n","MAGD","NGAYGD","DONGIA","DIENTICH","MANV","TENNV","SDTNV","LOAINHA","DIACHI","TONGTIEN");
            for(Giaodich gd: List)
            {
                if(gd instanceof Giaodichnha)
                {
                    gd.Output();
                    System.out.println("");
                }
            }
        }
        else{
            System.out.println("==== DANH SACH GIAO DICH DAT ===");
            System.out.printf("%-10s %-5s %-12s %-10s %-10s %-20s %-12s %-5s %-12s\n","MAGD","NGAYGD","DONGIA","DIENTICH","MANV","TENNV","SDTNV","LOAIDAT","TONGTIEN");
            for(Giaodich gd: List)
            {
                if(gd instanceof Giaodichdat)
                {
                    gd.Output();
                    System.out.println("");
                }
            }
            System.out.println("");
            System.out.println("==== DANH SACH GIAO DICH NHA ===");
            System.out.printf("%-10s %-5s %-12s %-10s %-10s %-20s %-12s %-10s %-20s %-12s\n","MAGD","NGAYGD","DONGIA","DIENTICH","MANV","TENNV","SDTNV","LOAINHA","DIACHI","TONGTIEN");
            for(Giaodich gd: List)
            {
                if(gd instanceof Giaodichnha)
                {
                    gd.Output();
                    System.out.println("");
                }
            }
        }
    }
    //3.TINH TRUNG BINH TIEN TAT CA CAC GIAO DICH DAT
    public double TbcGDD(){
        double count = 0, sum = 0;
        for (Giaodich gd: List) {
            if (gd instanceof Giaodichdat) {
                sum +=  gd.Tinhtien();
                count++;
            }
        }
        return sum/count;
    }
    //4.TIM GIAO DICH CO MA NHAP TU BAN PHIM
    public void TimMa(){
        String ma;
        System.out.println("============BAN MUON TIM MA GIAO DICH===========");
        System.out.print("Moi ban nhap ma giao dich: ");ma = cin.nextLine();
        boolean f = false;
        for(Giaodich gd: List) {
            if(ma.equals(gd.getMagd())){
                gd.Output();
                f = true;
                System.out.println("");
            }
        }
        if(f == false){
            System.out.println("KHONG CO MA CAN TIM");
        }
    }
    //5.DOI DON GIA CUA GIAO DICH CO MA NHAP TU BAN PHIM
    public void DoiDG(){
        Scanner cin = new Scanner(System.in);
        double doidg;
        String ma;
        System.out.println("============MOI BAN DOI DON GIA========");
        System.out.print("NHAP DON GIA BAN MUON DOI: ");
        doidg = cin.nextDouble();
        System.out.print("Nhap Ma Giao Dich: ");
        ma = cin.nextLine();ma = cin.nextLine();
        boolean flag = false;
        for(Giaodich gd: List){
            if (ma.equals(gd.getMagd())){
                gd.setDongia(doidg);
                System.out.println("==================================");
                gd.Output();
                System.out.println("");
                flag = true;
            }

        }
        if(flag == false){
            System.out.println("Ko Tim Duoc Ma");
        }
    }
    //6.XUAT RA CAC GIAO DICH THANG 3 NAM 2019
    public void OutputGD32019(){
        if (List.isEmpty()) {
            System.out.println("CHUA CO THONG TIN, VUI LONG NHAP LIEU TRUOC KHI XEM");
        }
        do {
            System.out.println("=== CAC GIAO DICH TRONG THANG 3 NAM 2019 ===");
            System.out.println("Nhap 1: GIAO DICH DAT");
            System.out.println("Nhap 2: GIAO DICH NHA");
            System.out.print(">> ");
            loai = cin.nextByte();
            if (loai > 2 || loai < 1) {
                System.out.println("Lua chon khong hop le! VUI long lua chon lai");
            }
        } while (loai > 2 || loai < 1);
        boolean f = false;
        if (loai == 1) {
            for(Giaodich gd : List) {
                if (gd instanceof Giaodich && gd.getYear() == 2019 && gd.getMonth() == 3) {
                    gd.Output();
                    f = true;
                    System.out.println("");
                }
            }
            if(f == false){
                System.out.println("======== KO CO DANH SACH ========");
            }

        } else if(loai == 2) {
            for(Giaodich gd : List) {
                if (gd instanceof Giaodichnha && gd.getYear() == 2019 && gd.getMonth() == 3) {
                    gd.Output();
                    f = true;
                    System.out.println("");
                }
            }
            if(f == false){
                System.out.println("======== KO CO DANH SACH ========");
            }
        }
    }
    //7.XOA GIAO DICH THEO MA NHAP TU BAN PHIM
    public void DeleteGd(){
        String ma;
        System.out.println("============BAN MUON TIM MA GIAO DICH===========");
        System.out.print("Moi ban nhap ma muon xoa: ");ma = cin.nextLine();
        boolean f = false;
        for(Giaodich gd: List) {
            if(ma.equals(gd.getMagd())){
                f = true;
            }
        }
        if(f == false){
            System.out.println("KHONG CO MA: " + ma);
            System.out.println("===============");
        }
        else{
            System.out.println("XOA MA NHE!!!");
            Iterator<Giaodich> irt = List.iterator();
            while(irt.hasNext()){
                Giaodich id = irt.next();
                if(id.getMagd().equals(ma)){
                    irt.remove();
                }
            }
            System.out.println("DONE!!!");

        }
    }
    //8.THEM MOT GIAO DICH
    public void ThemGd(){
        System.out.println("==== THEM GIAO DICH ====");
        System.out.println("1.Them Giao Dich Dat \n2.Them Giao Dich Nha");
        System.out.print("Moi Ban Chon: "); loai = cin.nextByte();
        if(loai == 1)
        {
            System.out.println("===== THEM GIAO DICH DAT =====");
            Giaodichdat gd1 = new Giaodichdat();
            gd1.Input();
            List.add(gd1);
        }
        else{
            System.out.println("======= THEM GIAO DICH NHA ========");
            Giaodichnha gd2 = new Giaodichnha();
            gd2.Input();
            List.add(gd2);
        }
    }
    //9.SAP XEP DANH SACH TANG DAN THEO (DONGIA/NGAYGD/DIENTICH)
    public void Sort(){
        if(List.isEmpty())
        {
            System.out.println("DANH SACH TRONG KHONG THE SAP XEP!");
        }
        else{
            List.sort(Comparator.comparing(Giaodich::getDientich).thenComparingDouble(Giaodich::getDongia));
            System.out.println("DA SAP XEP XONG!!!");
        }

    }
}
