/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidPracticalTest;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Hnana
 */
public class MyFrame extends JFrame{
        MyPanel p  ;

    public MyFrame()  {
        p = new MyPanel() ;
        this.setTitle("Mid Practical Test");
        
        this.setSize(5000, 5000);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p.setPreferredSize(new Dimension (500 , 500));
        
        this.add(p) ;
        
        this.pack();
        
        this.setVisible(true);
    }
}
