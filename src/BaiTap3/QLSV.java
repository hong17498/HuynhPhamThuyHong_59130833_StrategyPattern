/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author FPT
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    
    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    
    public void them(SinhVien sv){
        dsSV.add(sv);
    }
    
    private void swap(SinhVien sv1, SinhVien sv2) {
        SinhVien sv = sv1.sv;
        sv1.sv = sv2.sv;
        sv2.sv = sv;
    }
    
    public void sapXep(){
        for(int i = 0; i < dsSV.size() - 1; i++)
            for(int j = i+1; j < dsSV.size(); j++)
            {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0)
                    swap(dsSV.get(i),dsSV.get(j));
            }
    }

    public void inDS(){
        for(int i = 0; i < dsSV.size(); i++)
            dsSV.get(i).hienThi();
    }
}
