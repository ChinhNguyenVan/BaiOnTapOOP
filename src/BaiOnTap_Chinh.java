import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
 
public class BaiOnTap_Chinh {
	public static int menu() {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.println("========DANH SACH CONG VIEC=======");
        System.out.println("1.Nhap Danh Sach Giao Dich");
        System.out.println("2.Xuat Danh Sach Giao Dich");
        System.out.println("3.Tinh Trung Binh Thanh Tien Tat Ca Giao Dich Dat");
        System.out.println("4.Tim Giao Dich Co Ma Nhap Tu Ban Phim");
        System.out.println("5.Doi Don Gia Cua Giao Dich Co Ma Nhap Tu Ban Phim");
        System.out.println("6.Xuat Ra Cac Giao Dich Cua Thang 3 nam 2019");
        System.out.println("7.Xoa Giao Dich Theo Ma Nhap Tu Ban Phim");
        System.out.println("8.Them Mot Giao Dich");
        System.out.println("9.Sap Xep Danh Sach Tang Dan theo(DonGia/NgayGiaoDich/DienTich)");
        System.out.println("0.Thoat");
        System.out.print(">>");
        n = cin.nextInt();
        return n;
    }
    
    public static void main(String[] args) {
    	Quanly ql = new Quanly();
    	Scanner cin = new Scanner(System.in);
    	byte loai;
        while (true) {
            switch (menu()) {
            	case 1:
            	    do{
                        System.out.println("====================================");
                        System.out.println("=========== NHAP DANH SACH GIAO DICH ============");
                        System.out.println("====================================");
                        System.out.println("1.Nhap Giao Dich Dat \n2.Nhap Giao Dich Nha");
                        System.out.print("Moi ban chon chuc nang: ");loai = cin.nextByte();
                        if(loai <= 0 || loai >= 3)
                        {
                            System.out.println("Chon Sai roi! Chon lai di!!!");
                        }
                        else {
                            ql.Input(loai);
                        }
                    }while (loai <= 0 || loai >= 3 );
                    break;
                case 2:
                    do{
                        System.out.println("====================================");
                        System.out.println("=========== NHAP DANH SACH GIAO DICH ============");
                        System.out.println("====================================");
                        System.out.println("1.Xuat Giao Dich Dat \n2.Xuat Giao Dich Nha \n3.Xuat Toan Bo Danh Sach");
                        System.out.print("Moi ban chon chuc nang: ");loai = cin.nextByte();
                        if(loai <= 0 || loai >= 4)
                        {
                            System.out.println("Chon Sai roi! Chon lai di!!!");
                        }
                        else {
                            ql.Output(loai);
                        }
                    }while (loai <= 0 || loai >= 4 );
                    break;
                case 3:
                    System.out.println("TRUNG BINH CONG CUA GIAO DICH DAT LA: " + ql.TbcGDD());
                   	break;
                case 4:
                    ql.TimMa();
                    break;
                case 5:
                    ql.DoiDG();
                    break;
                case 6:
                    ql.OutputGD32019();
                    break;
                case 7:
                    ql.DeleteGd();
                    break;
                case 8:
                    ql.ThemGd();
                    break;
                case 9:
                    ql.Sort();
                    break;
                default:
                	System.out.println ("THOAT......");
                	System.exit(0);
            }
        }
    	
    }
}
