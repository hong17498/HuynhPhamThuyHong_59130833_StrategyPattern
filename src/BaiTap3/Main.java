/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;



/**
 *
 * @author FPT
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("Nguyễn Anh Tú", new SimpleDateFormat("dd/MM/yy").parse("04/7/1991"), 9)); 
        qlsv.them(new SinhVien("Ngô Hải Nam", new SimpleDateFormat("dd/MM/yy").parse("02/9/1990"), 8));
        qlsv.them(new SinhVien("Trần Văn Tuấn",new SimpleDateFormat("dd/MM/yy").parse("08/11/1999") ,7));
       
        
        System.out.println("\n Danh sách sinh viên:");
        qlsv.inDS();
        
        ISoSanh diem = new SoSanhTheoDiem();
        ISoSanh ten = new SoSanhTheoTen(); 
        
        qlsv.setSoSanh(ten);
        qlsv.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo tên: ");
        qlsv.inDS();
        
        qlsv.setSoSanh(diem);
        qlsv.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo điểm: ");
        qlsv.inDS();
    }
    
}
