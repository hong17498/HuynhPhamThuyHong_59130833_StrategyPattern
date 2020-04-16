/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author FPT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        context c = new context();
        
        c.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + c.tinh(75, 12));
        
        c.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + c.tinh(54, 78));
    }
    
}
