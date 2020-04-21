/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class GioHang{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHangHoa(HangHoa hh){
        dsHH.add(hh);
    }
    public int tinhTien(){
        int T=0;
        for(int i=0; i<dsHH.size(); i++){
            T = T + dsHH.get(i).getGia();
        }
        return T;
    }
    
    public double tienKhachTra(){
        return hinhThucTT.thanhToan(tinhTien());
    }
    public void hienThi(){
        for (int i=0; i<dsHH.size(); i++){
            System.out.println("Hàng hóa thứ " + (i+1));
            dsHH.get(i).hienThi();
    }
}
}
