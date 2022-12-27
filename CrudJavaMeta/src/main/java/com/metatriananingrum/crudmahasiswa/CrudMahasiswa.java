package com.metatriananingrum.crudmahasiswa;

import com.metatriananingrum.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;

public class CrudMahasiswa {
    
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
            }
        });
    }
}
