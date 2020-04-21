/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author FPT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GioHang gioHang1 = new GioHang();
        GioHang gioHang2 = new GioHang();
       
        gioHang1.setHinhThucTT(new ThanhToanOnline());
        gioHang2.setHinhThucTT(new ThanhToanCOD());
       
        HangHoa hangHoa1 = new HangHoa("Mì ăn liền", 5000, "Hình ảnh chỉ mang tính chất minh họa");
        HangHoa hangHoa2 = new HangHoa("Sữa",7000,"Sữa tươi tiệt trùng có đường");
        HangHoa hangHoa3 = new HangHoa("Rau",2300,"Xanh tươi tự nhiên");
        HangHoa hangHoa4 = new HangHoa("Cá",12000,"Cá tươi ngon");

        gioHang1.themHangHoa(hangHoa1);
        gioHang1.themHangHoa(hangHoa2);
        gioHang1.themHangHoa(hangHoa3);
        gioHang1.themHangHoa(hangHoa4);
       
        gioHang2.themHangHoa(hangHoa1);
        gioHang2.themHangHoa(hangHoa2);
        gioHang2.themHangHoa(hangHoa3);
        gioHang2.themHangHoa(hangHoa4);
        
        System.out.println("\nDanh sách hàng hóa của giỏ hàng khi thanh toan Online: ");
        gioHang1.hienThi();
        System.out.println("\nDanh sách hàng hóa của giỏ hàng khi thanh toan COD: ");
        gioHang2.hienThi();
        
        System.out.println("\nTong tien hang khi thanh toan Online: "+gioHang1.tinhTien());
        
        System.out.println("\nTong tien hang khi thanh toan COD: "+gioHang2.tinhTien());
        
        System.out.println("\nSo tien khach tra khi thanh toan Online: "+ gioHang1.tienKhachTra());
       
        System.out.println("\nSo tien khach tra khi thanh toan COD: "+gioHang2.tienKhachTra());
        
    }
    
}
