/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoringz.view;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Larissa
 */
public class Icons {
     public void insertIcon(JFrame form) {
        try {
            form.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/img/FavIcon-Site.png"));
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
